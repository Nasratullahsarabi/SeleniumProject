package com.cybertek.pages;

import com.cybertek.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebOrderPageAllOrderPageNew {

    @FindBy(xpath = "//h2[normalize-space()='List of All Orders']")
    public WebElement header;

    @FindBy(id = "ctl00_MainContent_btnCheckAll")
    public WebElement checkAll;

    @FindBy(id = "ctl00_MainContent_btnUncheckAll")
    public WebElement uncheckAll;

    @FindBy(id = "ctl00_MainContent_btnDelete")
    public WebElement deleteSection;

    @FindBy(id = "ctl00_MainContent_orderGrid_ctl02_OrderSelector")
    public WebElement oneSection;

    public WebOrderPageAllOrderPageNew(){
        PageFactory.initElements(Driver.getDriver(), this);
    }





}
