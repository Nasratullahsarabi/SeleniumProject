package com.cybertek.day02_Locators_FindByLinkText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //1. open chrome and navigate to http://zero.webappsecurity.com/
        driver.get("http://zero.webappsecurity.com/");
        //2. verify the title is `Zero - Personal Banking - Loans - Credit Cards` with if statement
        Thread.sleep(2000);
        //3. click on `signin button`
        WebElement signIn = driver.findElement(By.id("signin_button"));
        Thread.sleep(2000);
        signIn.click();
        //4. verify the title is "Zero- Log in"
        WebElement userName = driver.findElement(By.id("user_login"));
        Thread.sleep(2000);
        //5. enter text as "username" into username box
        userName.sendKeys("username");
        //6. enter text "password" into password box
        WebElement password = driver.findElement(By.id("user_password"));
        Thread.sleep(2000);
        password.sendKeys("password");
        //7. submit by clicking login button
        WebElement signIn2 = driver.findElement(By.name("submit"));
        Thread.sleep(2000);
        signIn2.click();
        WebElement advance = driver.findElement(By.id("details-button"));
        advance.click();
        Thread.sleep(2000);
        WebElement procced = driver.findElement(By.id("proceed-link"));
        procced.click();
        //8. verify you are at "Zero - Account Summary" page by checking title
        Thread.sleep(5000);

        driver.quit();

    }
}
