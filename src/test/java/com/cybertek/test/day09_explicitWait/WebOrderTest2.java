package com.cybertek.test.day09_explicitWait;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import com.cybertek.utility.WebOrderUtility2;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class WebOrderTest2 extends TestBase {

    @Test
    public void orderTest(){

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
        WebOrderUtility2.login(driver);
        BrowserUtil.waitFor(3);
    }

    @Test
    public void orderTest2(){

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
        WebOrderUtility2.login2(driver,"Tester","test");
        BrowserUtil.waitFor(3);
        driver.findElement(By.id("ctl00_logout")).click();
        BrowserUtil.waitFor(2);
        WebOrderUtility2.login2(driver,"Teser","test");
        BrowserUtil.waitFor(2);
        System.out.println("msg = " + driver.findElement(By.id("ctl00_MainContent_status")).getText());

        BrowserUtil.waitFor(3);
    }
}
