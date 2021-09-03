package com.cybertek.day02_Locators_FindByLinkText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        WebElement partialLink = driver.findElement(By.partialLinkText("Add/Remove"));
        partialLink.click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Home")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}
