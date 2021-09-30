package com.cybertek.test.day08_fileUpload_Actions;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScripExcutor2 extends TestBase {
    @Test
    public void excutor1(){
        driver.get("http://practice.cybertekschool.com/infinite_scroll");
        BrowserUtil.waitFor(2);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1000)");
        BrowserUtil.waitFor(4);

        for (int i = 0; i < 10; i++) {
            JavascriptExecutor jse1 = (JavascriptExecutor) driver;
            jse1.executeScript("window.scrollBy(0,750)");
            BrowserUtil.waitFor(2);
        }


    }

    @Test
    public void currentView(){

        driver.get("http://practice.cybertekschool.com/large");
        WebElement cybertek = driver.findElement(By.linkText("Cybertek School"));
        WebElement home = driver.findElement(By.linkText("Home"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true)", cybertek);
        BrowserUtil.waitFor(3);
        jse.executeScript("arguments[0].scrollIntoView(true)", home);
        BrowserUtil.waitFor(3);
    }

}
