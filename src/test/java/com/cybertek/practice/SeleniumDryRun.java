package com.cybertek.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDryRun {
    public static void main(String[] args) {
        // D:\ChromeExtension\chromedriver.exe
        // 1. set up chrome driver
        //System.setProperty("webdriver.chrome.driver", "D:\\ChromeExtension\\chromedriver.exe");
       WebDriverManager.chromedriver().setup();
        //2. create WebDriver instance that point to chrom driver
        WebDriver driver = new ChromeDriver();
        //3. Navigate to https//google.com
        driver.navigate().to("https://google.com");

    }
}
