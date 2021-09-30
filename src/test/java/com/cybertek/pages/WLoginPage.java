package com.cybertek.pages;

import com.cybertek.utility.ConfigReader;
import com.cybertek.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WLoginPage {

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement userNameField;

    @FindBy(name = "ctl00$MainContent$password" )
    public WebElement passwordField;

    @FindBy(css = "#ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(id="ctl00_MainContent_status")
    public WebElement errorMsg;


    public WLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void goTo(){
     Driver.getDriver().get(ConfigReader.read("weborder_url"));

    }

    public void login(String username, String password){
        userNameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    public boolean loginErrorMsgPresent(){

      return   errorMsg.isDisplayed();

    }

}
