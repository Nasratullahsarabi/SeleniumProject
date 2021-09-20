package com.cybertek.practice04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatingDropDownBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement dropDown = driver.findElement(By.id("dropdown"));
        Select selectObj = new Select(dropDown);
        selectObj.selectByIndex(2);
        selectObj.selectByValue("1");
        selectObj.selectByVisibleText("Option 2");
        System.out.println("---------------------------------------");
        WebElement year = driver.findElement(By.id("year"));
        Select yearObj = new Select(year);
        yearObj.selectByIndex(1);
        Thread.sleep(3000);
        yearObj.selectByIndex(yearObj.getOptions().size()-1);
        WebElement month = driver.findElement(By.id("month"));
        Select monthObj = new Select(month);
        monthObj.selectByIndex(7);
        Thread.sleep(3000);
        monthObj.selectByIndex(monthObj.getOptions().size()-1);
        WebElement day = driver.findElement(By.id("day"));
        Select dayObj = new Select(day);
        dayObj.selectByIndex(29);

        yearObj.selectByValue("1983");
        monthObj.selectByIndex(2);
        dayObj.selectByIndex(1);

        WebElement state = driver.findElement(By.id("state"));
        Select stateObj = new Select(state);
        stateObj.selectByValue("CA");
        Thread.sleep(3000);
        stateObj.selectByVisibleText("Alaska");


    }
}
