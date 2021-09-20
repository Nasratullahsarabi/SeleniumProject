package com.cybertek.day03_Locate_By_Tag_toGetAttr;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Practice3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        WebElement firstLink = driver.findElement(By.tagName("a"));
        System.out.println("firstLink.getText() = " + firstLink.getText());

        List<WebElement> allLink = driver.findElements(By.tagName("a"));
        System.out.println("allLink.size() = " + allLink.size());
        WebElement firstAlink = allLink.get(2);
        System.out.println("firstAlink.getText() = " + firstAlink.getText());
        System.out.println("--------------------------------------------");

//        for (WebElement eachLink : allLink) {
//            System.out.println("eachLink.getText() = " + eachLink.getText());
//            System.out.println("eachLink.getAttribute(\"href\") = " + eachLink.getAttribute("href"));
//        }

        WebElement firstH1Tag = driver.findElement(By.tagName("h1"));
        System.out.println("firstH1Tag.getText() = " + firstH1Tag.getText());
        List<WebElement> allH1Link = driver.findElements(By.tagName("h1"));
        for (WebElement eachLink : allH1Link) {
            System.out.println("eachLink.getText() = " + eachLink.getText());
        }



        driver.quit();
    }
}
