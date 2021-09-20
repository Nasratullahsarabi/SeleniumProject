package com.cybertek.practice04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElmFromFakeDropdown {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement fakeDropDown = driver.findElement(By.id("dropdownMenuLink"));
        fakeDropDown.click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Amazon")).click();
    }
}
