package com.cybertek.pages;

import com.cybertek.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WOrderPage {

    @FindBy(xpath = "//h2[normalize-space()='Order']")
    public WebElement header;

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement productDropDown;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtUnitPrice")
    public WebElement price;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtDiscount")
    public WebElement discount;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtTotal")
    public WebElement total;

    @FindBy(css = "input[type='submit']")
    public WebElement calcButton;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement street;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement street1;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement city;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement state;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zip;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement visa;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_1")
    public WebElement masterCard;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_2")
    public WebElement AmericanExpense;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNr;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expirationDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement proceed;

    @FindBy(xpath = "//strong[normalize-space(.)='New order has been successfully added.']")
    public WebElement succesMsg;

    public WOrderPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



}
