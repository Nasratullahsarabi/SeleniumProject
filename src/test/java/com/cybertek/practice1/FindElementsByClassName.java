package com.cybertek.practice1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsByClassName {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        WebElement searchBox = driver.findElement(By.className("h1y"));
        System.out.println("searchBox.getText() = " + searchBox.getText());
        WebElement firstElement =driver.findElement(By.className("list-group-item"));
        System.out.println("firstElement.getText() = " + firstElement.getText());
        List<WebElement> allElements = driver.findElements(By.className("list-group-item"));
        System.out.println("allElements.size() = " + allElements.size());
        for (WebElement eachElement : allElements) {
            System.out.println("eachElement.getText() = " + eachElement.getText());
        }

        driver.quit();
    }
}
