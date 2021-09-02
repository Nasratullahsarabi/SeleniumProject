package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://yahoo.com");

        WebElement searchBox = driver.findElement(By.id("ybar-sbq"));
        searchBox.sendKeys("Python");

        WebElement searchBtn = driver.findElement(By.id("ybar-search"));
        searchBtn.click();



        Thread.sleep(5000);
        driver.quit();
    }
}
