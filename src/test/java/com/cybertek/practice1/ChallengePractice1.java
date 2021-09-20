package com.cybertek.practice1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ChallengePractice1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://saucedemo.com");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println("title = " + title);
        WebElement userName = driver.findElement(By.id("user-name"));
        Thread.sleep(3000);
        userName.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        Thread.sleep(3000);
        password.sendKeys("secret_sauce");
        WebElement login = driver.findElement(By.id("login-button"));
        login.click();
        Thread.sleep(1000);
        WebElement firstItem = driver.findElement(By.linkText("Sauce Labs Backpack"));
        Thread.sleep(1000);
        System.out.println("firstItem.getAttribute(\"id\") = " + firstItem.getAttribute("id"));
        Thread.sleep(1000);
        WebElement firstItemLink1 = driver.findElement(By.className("inventory_item_name"));
        System.out.println("firstItemLink1.getText() = " + firstItemLink1.getText());
        Thread.sleep(1000);
        WebElement firstItemLink2 = driver.findElement(By.id("item_4_title_link"));
        System.out.println("firstItemLink2.getText() = " + firstItemLink2.getText());
        List<WebElement> allProducts = driver.findElements(By.className("inventory_item_name"));
        System.out.println("allProducts.size() = " + allProducts.size());
        for (WebElement eachProduct : allProducts) {
            System.out.println("eachProduct.getText() = " + eachProduct.getText());
        }

        WebElement cartBtn = driver.findElement(By.id("shopping_cart_container"));
        cartBtn.click();
        Thread.sleep(3000);
        WebElement continuShoping = driver.findElement(By.id("continue-shopping"));
        continuShoping.click();

        Thread.sleep(3000);

        driver.quit();


    }
}
