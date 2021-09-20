package com.cybertek.practice1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChallengePractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println("title = " + title);
        WebElement userName = driver.findElement(By.id("user-name"));
        Thread.sleep(3000);
        userName.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        Thread.sleep(3000);
        password.sendKeys("secret_sauce");
        WebElement login = driver.findElement(By.id("login-button"));
        login.click();
        Thread.sleep(3000);

        driver.quit();


    }
}
