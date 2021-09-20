package com.cybertek.day04_LocatingChecBoxes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatingDropDown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement yearDropDown = driver.findElement(By.id("year"));
        Select yearSelectObj = new Select(yearDropDown);
        yearSelectObj.selectByIndex(2);
        yearSelectObj.selectByValue("2000");
        yearSelectObj.selectByVisibleText("1990");
        //yearSelectObj.selectByVisibleText("bla bala");

        WebElement monthDropDownElm = driver.findElement(By.id("month"));
        Select monthSelectObj = new Select(monthDropDownElm);
        monthSelectObj.selectByIndex(4);
        monthSelectObj.selectByValue("7");
        monthSelectObj.selectByVisibleText("December");





    }
}
