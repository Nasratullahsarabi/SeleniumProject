package com.cybertek.practice08;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExcuterTest extends TestBase {
    @Test
    public void javaScript(){
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
    public void currentView(){
        driver.get("http://practice.cybertekschool.com/large");
        BrowserUtil.waitFor(2);
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        WebElement cybertekSchoolLink = driver.findElement(By.xpath("//div//a[.='Cybertek School']"));
        WebElement homeLink = driver.findElement(By.xpath("//a[.='Home']"));
        //int myScrollScript = 1000;

        jse.executeScript("arguments[0].scrollIntoView(true)",cybertekSchoolLink);
        BrowserUtil.waitFor(2);
        jse.executeScript("arguments[0].scrollIntoView(true)",homeLink);
        BrowserUtil.waitFor(2);


    }
}
