package com.cybertek.day04_LocatingChecBoxes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingCheckBox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkBox1 = driver.findElement(By.id("box1"));
        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());

        System.out.println("checkBox1.getAttribute(\"checked\") = " + checkBox1.getAttribute("checked"));
        WebElement checkBox2 = driver.findElement(By.id("box2"));
        System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected());
        System.out.println("checkBox2.getAttribute(\"checked\") = " + checkBox2.getAttribute("checked"));
        checkBox1.click();
        checkBox2.click();
        if (! checkBox1.isSelected()){
            checkBox1.click();
        }else {
            System.out.println("it is already checked");
        }
        if (! checkBox2.isSelected()){
            checkBox2.click();
        }else {
            System.out.println("it is already checked");
        }
        System.out.println("---------------------------------------------");
        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());
        System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected());

        driver.quit();
    }
}
