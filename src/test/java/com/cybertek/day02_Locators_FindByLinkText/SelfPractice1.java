package com.cybertek.day02_Locators_FindByLinkText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfPractice1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        WebElement firstLink = driver.findElement(By.linkText("A/B Testing"));
        firstLink.click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        WebElement secondLink = driver.findElement(By.linkText("Cybertek School"));
        Thread.sleep(2000);
        secondLink.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
