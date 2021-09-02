package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicNavigation {
    public static void main(String[] args) {

        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();

        //driver.get("https://amazon.com");
        //driver.navigate().back();
        //driver.navigate().forward();
        //driver.navigate().refresh();
        //driver.quit();
        //System.out.println("-------------------------------------");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver1 = new FirefoxDriver();
        driver1.get("https://amazon.com");
        driver1.get("https://google.com");
        driver1.navigate().back();
        driver1.navigate().forward();
        driver1.navigate().refresh();
        driver1.quit();
//        System.out.println("-------------------------------------------");
//        WebDriverManager.edgedriver().setup();
//        WebDriver driver2 = new EdgeDriver();
//        driver2.get("https:google.com");
//        driver2.navigate().to("https://amazon.com");
//        driver2.navigate().back();
//        driver2.navigate().forward();
//        driver2.navigate().refresh();
//        driver2.quit();

    }
}
