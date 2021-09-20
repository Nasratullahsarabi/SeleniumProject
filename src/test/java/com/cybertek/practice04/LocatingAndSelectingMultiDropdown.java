package com.cybertek.practice04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatingAndSelectingMultiDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement language = driver.findElement(By.name("Languages"));
        driver.manage().window().maximize();
        Select select = new Select(language);
        select.selectByIndex(3);
        Thread.sleep(3000);
        select.deselectByIndex(3);
        Thread.sleep(3000);
        select.selectByValue("java");
        Thread.sleep(3000);
        select.deselectByValue("java");
        Thread.sleep(3000);
        select.selectByVisibleText("C#");
        Thread.sleep(3000);
        select.deselectByVisibleText("C#");

    }
}
