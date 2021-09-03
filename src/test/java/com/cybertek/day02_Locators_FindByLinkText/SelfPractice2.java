package com.cybertek.day02_Locators_FindByLinkText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfPractice2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        driver.findElement(By.linkText("A/B Testing")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.linkText("Add/Remove Elements")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Home")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Autocomplete")).click();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Home")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Broken Images")).click();
        Thread.sleep(3000);
        driver.manage().window().setPosition(new Point(200,400));
        Thread.sleep(3000);
        driver.findElement(By.linkText("Home")).click();
        driver.quit();
    }
}
