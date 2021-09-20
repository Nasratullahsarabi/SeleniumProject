package com.cybertek.day03_Locate_By_Tag_toGetAttr;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Practice4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        //<span class="h1y">Test Automation Practice</span>

        WebElement element = driver.findElement(By.className("h1y"));
        System.out.println("element.getText() = " + element.getText());

        //<li class="list-group-item">...........</li>
//        WebElement classLinks = driver.findElement(By.className("list-group-item"));
//        System.out.println("classLinks.getText() = " + classLinks.getText());
//
//        List<WebElement> allLinks1 = driver.findElements(By.className("list-group-item"));
//
//        System.out.println("allLinks1.size() = " + allLinks1.size());
//
//        for (WebElement eachLink : allLinks1) {
//            System.out.println("eachLink.getText() = " + eachLink.getText());
//        }

        WebElement listLink = driver.findElement(By.className("list-group"));
        System.out.println("listLink.getText() = " + listLink.getText());
        driver.quit();
    }
}
