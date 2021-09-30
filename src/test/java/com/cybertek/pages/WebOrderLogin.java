package com.cybertek.pages;

import com.cybertek.utility.ConfigReader;
import com.cybertek.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebOrderLogin {

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement userName;

    @FindBy(name = "ctl00$MainContent$password")
    public WebElement pass;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement login;

    @FindBy(id = "ctl00_MainContent_status")
    public WebElement errorMsg;

    public WebOrderLogin(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    public void goTo(){

        Driver.getDriver().get(ConfigReader.read("weborder_url"));
    }

    public void webOrderPageLogin(String username, String password){

        userName.sendKeys(username);
        pass.sendKeys(password);
        login.click();

    }
    public boolean loginErrorMsg(){
        return errorMsg.isDisplayed();
    }

}
