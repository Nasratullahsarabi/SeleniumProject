package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PracticeFindElements {
    public static void main(String[] args) throws InterruptedException {

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://google.com");
//
//        WebElement serachBox = driver.findElement(By.name("q"));
//        serachBox.sendKeys("Java");
//        WebElement searchTtn = driver.findElement(By.name("btnK"));
//        searchTtn.submit();

//        WebDriverManager.edgedriver().setup();
//        WebDriver driver=new EdgeDriver();
//        driver.get("https://google.com");
//
//        WebElement serachBox = driver.findElement(By.name("q"));
//        serachBox.sendKeys("HTML");
//        WebElement searchBtn = driver.findElement(By.name("btnK"));
//        searchBtn.submit();

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://google.com");
//        Thread.sleep(3000);
//        driver.get("https://amazon.com");
//        Thread.sleep(3000);
//        driver.navigate().back();
//        Thread.sleep(3000);
//        driver.navigate().forward();

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        Thread.sleep(5000);
        searchBox.sendKeys("Python");
        Thread.sleep(5000);
        WebElement serachBtn = driver.findElement(By.name("btnK"));
        Thread.sleep(5000);
        serachBtn.submit();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        WebElement aboutLink = driver.findElement(By.linkText("About"));
        Thread.sleep(5000);
        aboutLink.click();

        Thread.sleep(5000);
        driver.quit();


    }
}
