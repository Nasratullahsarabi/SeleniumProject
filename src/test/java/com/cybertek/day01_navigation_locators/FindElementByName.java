package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByName {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://yahoo.com");

        WebElement searchBox = driver.findElement(By.name("p"));
        searchBox.sendKeys("CSS");
        WebElement serachBtn = driver.findElement(By.id("ybar-search"));
        serachBtn.click();

        Thread.sleep(5000);
        driver.close();
    }
}
