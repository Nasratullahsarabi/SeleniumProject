package com.cybertek.test.day09_explicitWait;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest extends TestBase {
    @Test
    public void explicitWait(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        WebElement loadingPageTitle = driver.findElement(By.xpath("//a[.='Example 7: Loading page title after 5 seconds']"));
        loadingPageTitle.click();
        WebDriverWait wait = new WebDriverWait(driver, 6);
        //wait.until(ExpectedConditions.titleIs ("Dynamic title")); first way and bellow is second way

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='rounded mx-auto d-block']")));


    }

    @Test
    public void testByTextBy(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        driver.findElement(By.partialLinkText("Example 7")).click();

        WebElement alertArea = driver.findElement(By.id("alert"));
        System.out.println("alertArea.getText() = " + alertArea.getText());
        WebDriverWait wait = new WebDriverWait(driver, 7);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='rounded mx-auto d-block']")));
        alertArea = driver.findElement(By.id("alert"));
        System.out.println("alertArea.getText() = " + alertArea.getText());
    }

    @Test
    public void waitForElmClickable(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputBox = driver.findElement(By.cssSelector("#input-example>input[type='text']"));
        driver.findElement(By.xpath("//button[.='Enable']")).click();

        WebDriverWait wait = new WebDriverWait(driver,5);
      // wait.until(elementToBeClickable(inputBox));

    }
}
