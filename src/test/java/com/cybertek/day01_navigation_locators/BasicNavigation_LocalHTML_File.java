package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation_LocalHTML_File {
    public static void main(String[] args) {
        //file:///D:/HtmlPractice/Practice3.html

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("file:///D:/HtmlPractice/Practice3.html");
        driver.close();
    }
}
