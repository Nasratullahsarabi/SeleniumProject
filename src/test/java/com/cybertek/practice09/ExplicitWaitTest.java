package com.cybertek.practice09;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest extends TestBase {
    @Test
    public void explicitWait(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        driver.findElement(By.partialLinkText("Example 7:")).click();
       WebDriverWait wait = new WebDriverWait(driver,5);
       wait.until(ExpectedConditions.titleIs("Dynamic title"));

       WebElement msg = driver.findElement(By.id("alert"));
       Assertions.assertTrue(msg.isDisplayed());

    }
    @Test
    public void clickable(){
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.xpath("//a[.='Dynamic Controls']")).click();
        driver.findElement(By.xpath("//button[.='Enable']")).click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        WebElement box = driver.findElement(By.xpath("//input[@type='text']"));
        //wait.until(ExpectedConditions.elementToBeClickable(box));
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message")));
        wait.until(ExpectedConditions.textToBe(By.id("message"), "It's enabled!"));

        box.sendKeys("Nasrat");
        BrowserUtil.waitFor(3);


    }
}
