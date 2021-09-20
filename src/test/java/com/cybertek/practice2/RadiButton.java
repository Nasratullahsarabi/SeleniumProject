package com.cybertek.practice2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadiButton {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        WebElement radiBtn = driver.findElement(By.linkText("Radio Buttons"));
        radiBtn.click();
        WebElement blue = driver.findElement(By.id("blue"));
        System.out.println("blue.isSelected() = " + blue.isSelected());
        blue.click();
        WebElement red = driver.findElement(By.id("red"));
        System.out.println("red.isSelected() = " + red.isSelected());
        red.click();
        System.out.println("red.isSelected() = " + red.isSelected());
        WebElement yellow = driver.findElement(By.id("yellow"));
        System.out.println("yellow.isSelected() = " + yellow.isSelected());
        yellow.click();
        System.out.println("yellow.isSelected() = " + yellow.isSelected());
        WebElement green = driver.findElement(By.id("green"));
        System.out.println("green.isSelected() = " + green.isSelected());
        green.click();
        System.out.println("green.isEnabled() = " + green.isEnabled());
        System.out.println("------------------------------------------------");
        List<WebElement> allColor = driver.findElements(By.name("color"));
        System.out.println("allColor.size() = " + allColor.size());
        for (WebElement eachColor : allColor) {
            System.out.println("eachColor.getAttribute(\"id\") = " + eachColor.getAttribute("id"));
            System.out.println("eachColor.isEnabled() = " + eachColor.isEnabled());
            System.out.println("eachColor.isSelected() = " + eachColor.isSelected());
        }


        driver.quit();
    }
}
