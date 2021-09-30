package com.cybertek.test.day11_property_driver_faker;

import com.cybertek.pages.WAllOrderPage;
import com.cybertek.pages.WCommonArea;
import com.cybertek.pages.WLoginPage;
import com.cybertek.pages.WOrderPage;
import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebOrderPOM_Test extends TestBase {

    @Test
    public void testWtihPOM_for_login(){
       // driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");

        WLoginPage loginPage = new WLoginPage();
        loginPage.goTo();
//        loginPage.userNameField.sendKeys("Tester");
//        loginPage.passwordField.sendKeys("test");
//        loginPage.loginButton.click();

        loginPage.login("TesterBlabla","testjh");
        Assertions.assertTrue(loginPage.loginErrorMsgPresent());
        System.out.println("loginPage.loginErrorMsgPresent() = " + loginPage.loginErrorMsgPresent());
        BrowserUtil.waitFor(2);
    }

    @Test
    public void testAllOrderPage(){
        WLoginPage loginPage = new WLoginPage();
        loginPage.goTo();
        loginPage.login("Tester","test");
        WAllOrderPage allOrderPage = new WAllOrderPage();
        Assertions.assertTrue(allOrderPage.header.isDisplayed());
        System.out.println("allOrderPage.header.getText() = " + allOrderPage.header.getText());
        allOrderPage.checkAllButton.click();
        BrowserUtil.waitFor(3);
        allOrderPage.unCheckAllButton.click();
        BrowserUtil.waitFor(2);

        System.out.println("allOrderPage.headerCells.size() = " + allOrderPage.headerCells.size());

        Assertions.assertEquals(13, allOrderPage.headerCells.size());


    }

    @Test
    public void commonArea(){
        WLoginPage loginPage = new WLoginPage();
        loginPage.goTo();
        loginPage.login("Tester", "test");

        WCommonArea commonArea = new WCommonArea();
        commonArea.orderTab.click();
        BrowserUtil.waitFor(2);

        commonArea.viewAllProductTab.click();

        BrowserUtil.waitFor(2);
        commonArea.viewAllOrderTab.click();
        BrowserUtil.waitFor(2);

    }

    @Test
    public void testOrderFlow(){

        WLoginPage loginPage = new WLoginPage();
        loginPage.goTo();
        loginPage.login("Tester", "test");
        WCommonArea commonArea = new WCommonArea();
        BrowserUtil.waitFor(2);
        commonArea.orderTab.click();
        BrowserUtil.waitFor(2);
        WOrderPage orderPage = new WOrderPage();

        WebElement product = orderPage.productDropDown;
        product.click();
        BrowserUtil.waitFor(2);
        Select select = new Select(product);
        select.selectByIndex(1);
        BrowserUtil.waitFor(2);

        orderPage.quantity.sendKeys(Keys.BACK_SPACE+"10");
        BrowserUtil.waitFor(2);
        orderPage.price.sendKeys(Keys.BACK_SPACE+"20");
        BrowserUtil.waitFor(2);
        orderPage.discount.sendKeys(Keys.BACK_SPACE+"5");
        BrowserUtil.waitFor(2);
        orderPage.calcButton.click();
        Faker faker = new Faker();
        orderPage.customerName.sendKeys(faker.name().fullName());
        BrowserUtil.waitFor(2);
        orderPage.street.sendKeys(faker.address().streetAddress());
        BrowserUtil.waitFor(2);
        orderPage.city.sendKeys(faker.address().city());
        BrowserUtil.waitFor(2);
        orderPage.state.sendKeys(faker.address().state());
        BrowserUtil.waitFor(2);
        orderPage.zip.sendKeys(faker.address().zipCode());
        BrowserUtil.waitFor(2);
        orderPage.visa.click();
        BrowserUtil.waitFor(2);
        orderPage.cardNr.sendKeys(faker.numerify("################"));
        BrowserUtil.waitFor(2);
        orderPage.expirationDate.sendKeys(faker.numerify("0#/0#"));
        BrowserUtil.waitFor(2);
        orderPage.proceed.click();
        BrowserUtil.waitFor(5);
    }
}
