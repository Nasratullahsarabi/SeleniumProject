package com.cybertek.day02_Locators_FindByLinkText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindMultipleElements {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");

        List<WebElement> allLink = driver.findElements(By.partialLinkText("A"));

        System.out.println("allLink.size() = " + allLink.size());

        WebElement firstItem = allLink.get(0);
        System.out.println("firstItem.getText() = " + firstItem.getText());

        WebElement secondItem = allLink.get(1);
        System.out.println("secondItem.getText() = " + secondItem.getText());

        WebElement thirdItem = allLink.get(2);
        System.out.println("thirdItem.getText() = " + thirdItem.getText());

        for (WebElement eachLink : allLink){
            System.out.println("eachLink.getText() = " + eachLink.getText());

        }

        driver.quit();


    }
}
