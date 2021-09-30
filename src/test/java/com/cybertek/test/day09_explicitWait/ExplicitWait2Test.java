package com.cybertek.test.day09_explicitWait;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class ExplicitWait2Test extends TestBase {
    @Test
    public void waitUntilElementInteractable(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputBox = driver.findElement(By.cssSelector("#input-example>input[type='text']"));
        System.out.println(inputBox.isEnabled());
        driver.findElement(By.xpath("//button[.='Enable']")).click();

        WebDriverWait wait = new WebDriverWait(driver,7);
        //this will wait for 7 seconds max for input elmenet located by cssSelector
        //wait.until(elementToBeClickable(By.cssSelector("form#input-example>input")));
        wait.until(elementToBeClickable(inputBox));
        inputBox.sendKeys("Hi Hi Hello");
        System.out.println(inputBox.isEnabled());
        BrowserUtil.waitFor(3);

    }
}
