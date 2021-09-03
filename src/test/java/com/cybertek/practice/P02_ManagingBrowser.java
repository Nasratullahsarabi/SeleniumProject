package com.cybertek.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02_ManagingBrowser {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://google.com");

        driver.manage().window().maximize();
       // driver.manage().window().fullscreen();
        driver.manage().window().setPosition(new Point(300, 25));
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        driver.manage().window().setSize(new Dimension(200, 300));
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());

        System.out.println("The end");

    }
}
