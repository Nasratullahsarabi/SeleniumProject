package com.cybertek.test.day11_property_driver_faker;

import com.cybertek.pages.CommonAreaNew;
import com.cybertek.pages.WebOrderLogin;
import com.cybertek.pages.WebOrderPageAllOrderPageNew;
import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WebOrderPagePractice extends TestBase {

    @Test
    public void login(){
//        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
        WebOrderLogin webOrderLogin = new WebOrderLogin();
        webOrderLogin.goTo();
//        webOrderLogin.userName.sendKeys("Tester");
//        webOrderLogin.pass.sendKeys("test");
//        webOrderLogin.login.click();
        webOrderLogin.webOrderPageLogin("Teer","test");

        System.out.println("webOrderLogin.errorMsg.getText() = " + webOrderLogin.errorMsg.getText());
        Assertions.assertTrue(webOrderLogin.errorMsg.isDisplayed());
        BrowserUtil.waitFor(3);

    }

    @Test
    public void allOrderPageNew(){

        WebOrderLogin login = new WebOrderLogin();
        login.goTo();
        login.webOrderPageLogin("Tester", "test");
        BrowserUtil.waitFor(2);
        WebOrderPageAllOrderPageNew newPrac = new WebOrderPageAllOrderPageNew();
        System.out.println("newPrac.header.getText() = " + newPrac.header.getText());
        newPrac.checkAll.click();
        BrowserUtil.waitFor(2);
        newPrac.uncheckAll.click();
        BrowserUtil.waitFor(2);
        newPrac.oneSection.click();
        BrowserUtil.waitFor(2);
        newPrac.deleteSection.click();
        BrowserUtil.waitFor(5);
    }

    @Test
    public void commonAreaPrac(){

        WebOrderLogin login = new WebOrderLogin();
        login.goTo();
        login.webOrderPageLogin("Tester", "test");
        BrowserUtil.waitFor(2);
        CommonAreaNew common = new CommonAreaNew();
        BrowserUtil.waitFor(2);
        common.order.click();
        BrowserUtil.waitFor(2);
        common.viewAllOrder.click();
        BrowserUtil.waitFor(2);
        common.viewAllProduct.click();
        BrowserUtil.waitFor(2);
        common.logout.click();
        BrowserUtil.waitFor(3);
    }
}
