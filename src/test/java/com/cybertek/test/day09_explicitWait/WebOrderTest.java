package com.cybertek.test.day09_explicitWait;

import com.cybertek.utility.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebOrderTest extends TestBase {
    @Test
    public void testLogin(){

        //driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
        WebOrderUtility.openWebOrderApp();
//        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
//        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
//        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
 //       WebOrderUtility.login(driver);

        //WebOrderUtility.login(driver);
        WebOrderUtility_Old.login(driver,"Tester","test");
        System.out.println("is at order page = " + WebOrderUtility_Old.isAtOrderPage(driver));
        BrowserUtil.waitFor(2);
        WebOrderUtility_Old.logout(driver);

        WebOrderUtility_Old.login(driver,"blabla","blabla");
        BrowserUtil.waitFor(2);
        System.out.println(" is at order page = " + WebOrderUtility_Old.isAtOrderPage(driver));
        BrowserUtil.waitFor(2);


    }

    @Test
    public void testDriverUtilityLoginLogout(){
        WebOrderUtility.openWebOrderApp();
        WebOrderUtility.login();

        Assertions.assertTrue(WebOrderUtility.isatAllOrderPage());
  //      WebOrderUtility.logout();

        System.out.println("last test1 = " + WebOrderUtility.verifyUserName("Tester"));
        System.out.println("last test2 = " + WebOrderUtility.getUserNameFromWelcomeMsg());
        Assertions.assertTrue(WebOrderUtility.verifyUserName("Tester"));
        Assertions.assertEquals("Tester",WebOrderUtility.getUserNameFromWelcomeMsg());

        WebOrderUtility.selectSidebarTab("View all orders");
        BrowserUtil.waitFor(2);
        WebOrderUtility.selectSidebarTab("View all products");
        BrowserUtil.waitFor(2);
        WebOrderUtility.selectSidebarTab("Order");
        BrowserUtil.waitFor(2);
        WebOrderUtility.selectSidebarTab("blabla");
        BrowserUtil.waitFor(2);


    }
}
