package com.cybertek.pages;

import com.cybertek.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonAreaNew {

    @FindBy(linkText = "Logout")
    public WebElement logout;

    @FindBy(xpath = "//a[.='View all orders']")
    public WebElement viewAllOrder;

    @FindBy(xpath = "//a[.='View all products']")
    public WebElement viewAllProduct;

    @FindBy(xpath = "//a[.='Order']")
    public WebElement order;

    public CommonAreaNew(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
