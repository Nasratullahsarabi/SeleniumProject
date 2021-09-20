package com.cybertek.practice04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingCheckBox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver() ;
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement checkBox1 = driver.findElement(By.id("box1"));
        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());
        System.out.println("checkBox1.isEnabled() = " + checkBox1.isEnabled());
        //checkBox1.click();
        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());
        System.out.println("checkBox1.isEnabled() = " + checkBox1.isEnabled());

        WebElement checkBox2 = driver.findElement(By.id("box2"));
        System.out.println("----------------------------------------------------------");

        if (!checkBox1.isSelected()){
            checkBox1.click();
            System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());
        }else{

            System.out.println("check box1 is already selected");
        }

        if (!checkBox2.isSelected()){
            checkBox2.click();
            System.out.println("checkBox2.isSelected() = " + checkBox2.isSelected());
        }else {
            System.out.println("check box2 is already selected");
        }

        driver.quit();


    }
}
