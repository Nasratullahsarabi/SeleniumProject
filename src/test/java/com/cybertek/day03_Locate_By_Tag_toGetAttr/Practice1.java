package com.cybertek.day03_Locate_By_Tag_toGetAttr;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        driver.get("http://practice.cybertekschool.com/");
//
//        WebElement firstLink = driver.findElement(By.linkText("A/B Testing"));
//        System.out.println("firstLink.getText() = " + firstLink.getText());
//        System.out.println("firstLink.getAttribute(\"href\") = " + firstLink.getAttribute("href"));
//        System.out.println("firstLink.getAttribute(\"class\") = " + firstLink.getAttribute("class"));

        driver.get("https://google.com");
        WebElement link = driver.findElement(By.name("q"));
        System.out.println("link.getAttribute(\"type\") = " + link.getAttribute("type"));

        driver.quit();
    }
}
