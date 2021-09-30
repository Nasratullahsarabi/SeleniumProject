package com.cybertek.test.day10_HomeWork;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.Driver;
import com.cybertek.utility.TestBase;
import com.cybertek.utility.WebOrderUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebOrderTestPractice extends TestBase {

    @Test
    public void testDriverPractice(){

        WebOrderUtil.openWebOrderApp();
        assertEquals("Web Orders Login", driver.getTitle());
        BrowserUtil.waitFor(2);
       // WebOrderUtil.login();
        WebOrderUtil.login("Tester","test");
        BrowserUtil.waitFor(3);

    }

    @Test
    public void testInvalidCredential(){
        WebOrderUtil.openWebOrderApp();
        WebOrderUtil.login("abac", "aihy");

//        WebElement errorMsg = driver.findElement(By.xpath("//span[.='Invalid Login or Password.']"));
//        assertTrue(errorMsg.isDisplayed());
//        WebDriverWait wait = new WebDriverWait(driver,2);
//
//        try {
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='blaInvalid Login or Password.']")));
//        }catch (TimeoutException e){
//            System.out.println("getting message from e"+e.getMessage());
//       }

//        boolean elementfound = BrowserUtil.checkVisibilityOfElement(By.xpath("//span[.='Invalid Login or Password.']"),2);

        assertTrue(WebOrderUtil.loginErrorMsgVisible());

    }

    @Test
    public void isAtOrderPage(){
        WebOrderUtil.openWebOrderApp();
        WebOrderUtil.login("Tester", "blaa");
        WebOrderUtil.isAtOrderPage();
    }

    @Test
    public void testClearBox(){
        WebOrderUtil.openWebOrderApp();
        WebElement usernameFeild = Driver.getDriver().findElement(By.id("ctl00_MainContent_username"));
        usernameFeild.sendKeys("aljsdlkja;sldkjflaksjfd;");
        BrowserUtil.waitFor(2);
        usernameFeild.clear();
        BrowserUtil.waitFor(2);

    }

    @Test
    public void demonstratingBrowserCloseIssue(){
        WebOrderUtil.openWebOrderApp();

        driver.get("https://google.com");
    }
}
