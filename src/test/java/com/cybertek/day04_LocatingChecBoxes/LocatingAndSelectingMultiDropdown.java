package com.cybertek.day04_LocatingChecBoxes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatingAndSelectingMultiDropdown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement langDropdownElm = driver.findElement(By.name("Languages"));
        Select langSelectObj = new Select(langDropdownElm);

        System.out.println("langSelectObj.isMultiple() = " + langSelectObj.isMultiple());
        langSelectObj.selectByIndex(1);
        langSelectObj.selectByValue("c");
        langSelectObj.selectByVisibleText("Java");

        System.out.println("langSelectObj.isMultiple() = " + langSelectObj.isMultiple());
        langSelectObj.deselectByIndex(1);
        langSelectObj.deselectByValue("c");
        langSelectObj.deselectByVisibleText("Java");

        langSelectObj.getFirstSelectedOption();
        //driver.quit();
    }
}
