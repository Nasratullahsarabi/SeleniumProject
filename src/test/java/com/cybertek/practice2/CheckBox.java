package com.cybertek.practice2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        Thread.sleep(2000);
        WebElement checkBoxes = driver.findElement(By.linkText("Checkboxes"));
        Thread.sleep(2000);
        checkBoxes.click();

        WebElement checkBox1 = driver.findElement(By.id("box1"));
        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());

        checkBox1.click();
        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());

        WebElement checkBox2 = driver.findElement(By.id("box2"));
        System.out.println("checkBox2.getAttribute(\"checked\") = " + checkBox2.getAttribute("checked"));
        checkBox2.click();
        System.out.println("checkBox2.getAttribute() = " + checkBox2.getAttribute("checked"));


        if (! checkBox1.isSelected()){
            checkBox1.click();
        }else {
            System.out.println("checkBox1 is already selected = ");
        }

        driver.quit();

    }
}
