package com.cybertek.officeHours.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MoneyGaming {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://moneygaming.qa.gameaccount.com/");
        Thread.sleep(10000);
        ////a[@class='newUser green']
        WebElement joinNow = driver.findElement(By.xpath("//a[@class='newUser green']"));
        joinNow.click();
        //  //select[@name='map(title)']

        //WebElement element = driver.findElement(By.xpath("//select[@name='map(title)']"));
        WebElement titleDropdown = driver.findElement(By.id("title"));
        Select dropdown = new Select(titleDropdown);
        dropdown.selectByVisibleText("Mr");

        //  //input[@name='map(firstName)']

        WebElement firstName = driver.findElement(By.xpath("//input[@name='map(firstName)']"));
        firstName.sendKeys("Mike");

        WebElement lastName = driver.findElement(By.xpath("//input[@name='map(lastName)']"));
        lastName.sendKeys("Smith");

        //  //input[@id='checkbox']
        WebElement checkBox = driver.findElement(By.xpath("//input[@id='checkbox']"));
        checkBox.click();
        ////input[@class='promoReg green']
        Thread.sleep(4000);
        WebElement joinNow2 = driver.findElement(By.xpath("//input[@class='promoReg green']"));
        joinNow2.click();

        // //label[@for='dob']
        WebElement actualResult = driver.findElement(By.xpath("//label[@for='dob']"));
        System.out.println("actualResult.getText() = " + actualResult.getText());

        System.out.println("Test passed");

        driver.quit();


    }
}
