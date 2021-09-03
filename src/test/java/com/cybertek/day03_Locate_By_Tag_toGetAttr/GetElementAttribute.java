package com.cybertek.day03_Locate_By_Tag_toGetAttr;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementAttribute {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        driver.get("http://practice.cybertekschool.com/");
//        WebElement firstLink = driver.findElement(By.linkText("A/B Testing"));
//
//        System.out.println("firstLink.getText() = " + firstLink.getText());
//
//        System.out.println("firstLink.getAttribute(\"href\") = " + firstLink.getAttribute("href"));

        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Java");
        System.out.println("searchBox.getAttribute(\"class\") = " + searchBox.getAttribute("class"));
        System.out.println("searchBox.getAttribute(\"maxLength\") = " + searchBox.getAttribute("maxLength"));
        System.out.println("searchBox.getAttribute(\"title\") = " + searchBox.getAttribute("title"));
        System.out.println("searchBox.getAttribute(\"autocapitalize\") = " + searchBox.getAttribute("autocapitalize"));
        System.out.println("searchBox.getAttribute(\"spellcheck\") = " + searchBox.getAttribute("spellcheck"));
        System.out.println("searchBox.getAttribute(\"role\") = " + searchBox.getAttribute("role"));
        System.out.println("searchBox.getAttribute(\"autocorrect\") = " + searchBox.getAttribute("autocorrect"));
        System.out.println("searchBox.getAttribute(\"autofocus role\") = " + searchBox.getAttribute("autofocus"));

        System.out.println("searchBox.getAttribute(\"value\") = " + searchBox.getAttribute("value"));

        //Home work: identify the google search btn and get bellow attirbutes
        //class, type, value, data and the rest

        driver.quit();

    }
}
