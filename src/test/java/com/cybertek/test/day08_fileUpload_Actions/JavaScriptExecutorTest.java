package com.cybertek.test.day08_fileUpload_Actions;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorTest extends TestBase {

    @Test
    public void testScrollWholeWindow(){
        driver.get("http://practice.cybertekschool.com/infinite_scroll");
        BrowserUtil.waitFor(2);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1000)");
        BrowserUtil.waitFor(2);

        for (int i = 0; i < 10; i++) {
            jse.executeScript("window.scrollBy(0,1000)");
            BrowserUtil.waitFor(1);
        }

    }
    @Test
    public void testScrollElementIntoView(){
        driver.get("http://practice.cybertekschool.com/large");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        int myScrollNumber = 1000;
        jse.executeScript("window.scrollBy(0,arguments[0])", myScrollNumber);
        WebElement cybertekLink = driver.findElement(By.linkText("Cybertek School"));
        jse.executeScript("arguments[0].scrollIntoView(true)", cybertekLink);

        BrowserUtil.waitFor(3);

    }
}
