package com.cybertek.day04_LocatingChecBoxes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatingRadioBtn {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement radioBtnBlue = driver.findElement(By.id("blue"));
        System.out.println("radioBtnBlue.isSelected() = " + radioBtnBlue.isSelected());

        WebElement redRadio = driver.findElement(By.id("red"));
        System.out.println("radioBtnBlue.isSelected() = " + redRadio.isSelected());
        redRadio.click();
        System.out.println("redRadio.isSelected() = " + redRadio.isSelected());
        System.out.println("radioBtnBlue.isSelected() = " + radioBtnBlue.isSelected());
        WebElement greenRadio = driver.findElement(By.id("green"));
        System.out.println("radioBtnBlue.isSelected() = " + greenRadio.isSelected());
        System.out.println("greenRadio.isEnabled() = " + greenRadio.isEnabled());
        greenRadio.click();
        System.out.println("greenRadio.isSelected() = " + greenRadio.isSelected());

        List<WebElement> allRadios = driver.findElements(By.name("color"));
        System.out.println("allRadios.size() = " + allRadios.size());
        allRadios.get(2).click();

        for (WebElement eachRadio : allRadios) {
            System.out.println("-----------------------------------------");
            System.out.println("eachRadio.getAttribute(\"id\") = " + eachRadio.getAttribute("id"));
            System.out.println("eachRadio.isSelected() = " + eachRadio.isSelected());
            System.out.println("eachRadio.isEnabled() = " + eachRadio.isEnabled());
            System.out.println("-----------------------------------------");
        }


        // driver.quit();
    }
}
