package com.cybertek.day03_Locate_By_Tag_toGetAttr;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

//        WebElement searchBox = driver.findElement(By.name("q"));
//        searchBox.sendKeys("java");
//        System.out.println("searchBox.getAttribute(\"value\") = " + searchBox.getAttribute("value"));

        WebElement searchBtn = driver.findElement(By.name("btnK"));
        System.out.println("searchBtn.getAttribute(\"value\") = " + searchBtn.getAttribute("value"));
        System.out.println("searchBtn.getAttribute(\"class\") = " + searchBtn.getAttribute("class"));
        System.out.println("searchBtn.getAttribute(\"arial-label\") = " + searchBtn.getAttribute("aria-label"));
        System.out.println("searchBtn.getAttribute(\"type\") = " + searchBtn.getAttribute("type"));
        System.out.println("searchBtn.getAttribute(\"date-ved\") = " + searchBtn.getAttribute("data-ved"));
        System.out.println("searchBtn.getAttribute(\"name\") = " + searchBtn.getAttribute("name"));

        driver.quit();
    }
}
