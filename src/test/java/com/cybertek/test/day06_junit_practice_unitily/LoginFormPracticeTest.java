package com.cybertek.test.day06_junit_practice_unitily;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginFormPracticeTest {

    WebDriver driver;

    @BeforeEach
    public void setupWebDriver(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }

    @Test
    public void testLogin(){
        driver.get("http://practice.cybertekschool.com/login");

        WebElement header = driver.findElement(By.xpath("//h2[.='Login Page']"));
        System.out.println("header.getText() = " + header.getText());

        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("SuperSecretPassword");

        driver.findElement(By.id("wooden_spoon")).click();

        // //div[contains(text(), 'You logged into a secure area!')]
        WebElement successMsg = driver.findElement(By.xpath("//div[@id='flash']"));

        String expectedResult = "You logged into a secure area!";
        String actualResult = successMsg.getText();

       // assertEquals(expectedResult, actualResult);
        assertTrue(actualResult.startsWith(expectedResult));

        System.out.println("successMsg.isDisplayed() = " + successMsg.isDisplayed());

        WebElement successMsg2 = driver.findElement(By.xpath("//div[contains(text(), 'You logged into a secure area!')]"));

       assertTrue(successMsg2.isDisplayed());

    }
}
