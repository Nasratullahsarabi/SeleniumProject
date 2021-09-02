package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P004_Practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

//        driver.get("https://google.com");
//        Thread.sleep(3000);
//        driver.get("https://amazon.com");
//        Thread.sleep(3000);
//        driver.navigate().back();
//        Thread.sleep(3000);
//        driver.navigate().forward();
//        Thread.sleep(3000);
//        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
//        searchBox.sendKeys("iPhon11 case");
//        WebElement tabBtn = driver.findElement(By.id("nav-search-submit-button"));
//        Thread.sleep(3000);
//        tabBtn.submit();
//        Thread.sleep(5000);

        driver.get("https://facebook.com");
        Thread.sleep(3000);
        WebElement userName = driver.findElement(By.id("email"));
        userName.sendKeys("ahai@gmail.com");
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("Ya99rB&&i1@");
        WebElement logIn = driver.findElement(By.name("login"));
        Thread.sleep(000);
        logIn.submit();
        Thread.sleep(6000);
        driver.navigate().back();
        Thread.sleep(3000);
        WebElement forgotPass = driver.findElement(By.linkText("Forgot Password?"));
        Thread.sleep(3000);
        forgotPass.click();
        Thread.sleep(3000);
        WebElement mobileNum = driver.findElement(By.id("identify_email"));
        Thread.sleep(3000);
        mobileNum.sendKeys("912845765");
        Thread.sleep(3000);
        WebElement serachBtn = driver.findElement(By.id("did_submit"));
        Thread.sleep(3000);
        serachBtn.click();
        Thread.sleep(3000);
        WebElement cancel = driver.findElement(By.linkText("Cancel"));
        Thread.sleep(3000);
        cancel.click();
        Thread.sleep(3000);
        driver.quit();

    }
}
