package com.cybertek.day02_Locators_FindByLinkText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWCopy {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        driver.get("https://google.com");
        Thread.sleep(1000);


        WebElement searchBox = driver.findElement(By.xpath("//input[@jsaction=\"paste:puy29d;\"]"));

        searchBox.click();
        searchBox.sendKeys("selenium");
        searchBox.submit();


        WebElement about = driver.findElement(By.id("result-stats"));

        System.out.println("about.getText() = " + about.getText());

    }
}
