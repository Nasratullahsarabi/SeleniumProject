package com.cybertek.practice04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SauceDemoPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.cssSelector("#user-name"));
        userName.sendKeys("standard_user");
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        password.submit();
        // product page: //select[@class='product_sort_container']
        WebElement productCategori = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        Select proCategori = new Select(productCategori);
        Thread.sleep(2000);
        proCategori.selectByIndex(2);
        //first prodct price: //div[@class='inventory_item'][1]//div[@class='inventory_item_price']
        // all product price: //div[@class='inventory_item_price']
        WebElement price = driver.findElement(By.xpath("//div[@class='inventory_item'][1]//div[@class='inventory_item_price']"));
        System.out.println("price.getText() = " + price.getText());
        List<WebElement> allPrice = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
        for (WebElement eachProPrice : allPrice) {
            System.out.println("eachProPrice.getText() = " + eachProPrice.getText());
        }

        //first product name // //div[@class='inventory_item'][1]//div[@class='inventory_item_name']
        WebElement productName = driver.findElement(By.xpath("//div[@class='inventory_item'][1]//div[@class='inventory_item_name']"));
        System.out.println("productName.getText() = " + productName.getText());
        // all product name: //div[@class='inventory_item_name']
        List<WebElement> allProName = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        for (WebElement eachProName : allProName) {
            System.out.println("eachProName.getText() = " + eachProName.getText());
        }
        System.out.println("productName.getText() = " + productName.getText());

        //add to cart  //button[@id='add-to-cart-sauce-labs-backpack']
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        // remove from cart  //button[@id='remove-sauce-labs-backpack']
        // cart button:  //div[@id='shopping_cart_container']/a/span[@class='shopping_cart_badge']
        driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a/span[@class='shopping_cart_badge']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Nasrat");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Sarabi");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("92115");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='finish']")).click();






    }
}
