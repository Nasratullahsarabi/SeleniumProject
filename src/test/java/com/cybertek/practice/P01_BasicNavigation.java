package com.cybertek.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P01_BasicNavigation {
    public static void main(String[] args) {

//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://google.com");
//        driver.navigate().back(); // it navigates first and come back immediately
//        driver.navigate().forward(); // it
//        driver.navigate().refresh();

//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
//        driver.navigate().back();
//        driver.navigate().forward();
//        driver.navigate().refresh();

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


    }
}
