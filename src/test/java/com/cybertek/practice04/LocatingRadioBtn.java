package com.cybertek.practice04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatingRadioBtn {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blue = driver.findElement(By.id("blue"));
        System.out.println("blue.isSelected() = " + blue.isSelected());
        blue.click();
        WebElement red = driver.findElement(By.id("red"));
        red.click();
        System.out.println("blue.isSelected() = " + blue.isSelected());
        System.out.println("red.isSelected() = " + red.isSelected());

        System.out.println("-------------------------------------------------");

        List<WebElement> colors = driver.findElements(By.name("color"));
        System.out.println("colors.size() = " + colors.size());
        for (WebElement eachColor : colors) {
            System.out.println("eachColor.getAttribute(\"id\") = " + eachColor.getAttribute("id"));
            Thread.sleep(3000);
            eachColor.click();
            System.out.println("eachColor.isSelected() = " + eachColor.isSelected());
        }


        driver.quit();
    }
}
