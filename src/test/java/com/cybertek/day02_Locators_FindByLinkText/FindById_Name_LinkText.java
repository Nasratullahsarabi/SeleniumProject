package com.cybertek.day02_Locators_FindByLinkText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindById_Name_LinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.facebook.com/");

        WebElement logIn = driver.findElement(By.id("email"));
        logIn.sendKeys("some email here");
        WebElement pass = driver.findElement(By.name("pass"));
        pass.sendKeys("some pass word");

        WebElement logInBtn = driver.findElement(By.name("login"));
        logInBtn.click();
        Thread.sleep(6000);
        driver.navigate().back();
        WebElement forgotPass = driver.findElement(By.linkText("Forgot Password?"));
        forgotPass.click();
        WebElement mobileNum = driver.findElement(By.id("identify_email"));
        mobileNum.sendKeys("123456789");
        Thread.sleep(3000);
        WebElement search = driver.findElement(By.id("did_submit"));
        search.click();
        Thread.sleep(6000);
        WebElement cancel = driver.findElement(By.linkText("Cancel"));
        cancel.click();
        Thread.sleep(3000);
        driver.quit();


    }
}
