package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Edge {
    public static void main(String[] args) {

        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.navigate().to("https://google.com");
        //driver.manage().window().setSize(new Dimension(200,300));
        driver.manage().window().setPosition(new Point(200,100));

        WebDriverManager.edgedriver().setup();
        WebDriver driver1 = new EdgeDriver();
        driver1.get("https://amazon.com");
        //driver1.manage().window().setSize(new Dimension(300, 200));
        driver1.manage().window().setPosition(new Point(100,200));


    }
}
