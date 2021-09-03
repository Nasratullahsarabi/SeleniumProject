package com.cybertek.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://yahoo.com");
        WebElement searchBox = driver.findElement(By.id("ybar-sbq"));
        searchBox.sendKeys("Java");
        WebElement serachBtn = driver.findElement(By.id("ybar-search"));
        serachBtn.click();

        Thread.sleep(4000);
        driver.quit();

    }
}
