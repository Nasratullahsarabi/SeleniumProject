package com.cybertek.practice1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementByTagName1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        WebElement firstLink = driver.findElement(By.tagName("a"));
        System.out.println("searchBox.getText() = " + firstLink.getText());

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("links.size() = " + links.size());
        System.out.println("links.get(1).getText() = " + links.get(1).getText());

        for (WebElement eachlink : links) {
            System.out.println("eachlink.getText() = " + eachlink.getText());
        }
        firstLink.click();



        driver.quit();

    }
}
