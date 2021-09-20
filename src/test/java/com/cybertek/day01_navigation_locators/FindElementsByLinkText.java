package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsByLinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        WebElement seachBox = driver.findElement(By.name("q"));
        seachBox.sendKeys("Python");

        WebElement serachIcon = driver.findElement(By.name("btnK"));
        serachIcon.submit();

        WebElement aboutLink = driver.findElement(By.linkText("About"));



        Thread.sleep(5000);
        driver.close();
    }
}
