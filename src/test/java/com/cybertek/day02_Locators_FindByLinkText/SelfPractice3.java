package com.cybertek.day02_Locators_FindByLinkText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SelfPractice3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

//       List<WebElement> links = driver.findElements(By.partialLinkText("Sh"));
//
//        for (WebElement eachLink : links) {
//            System.out.println("eachLink.getText() = " + eachLink.getText());
//        }
//        System.out.println("-----------------------------------------------------------------");
//        List<WebElement> linksFo = driver.findElements(By.partialLinkText("Fo"));
//        System.out.println("linksFo.size() = " + linksFo.size());
//
//        for (WebElement eachLink : linksFo) {
//            System.out.println("eachLink.getText() = " + eachLink.getText());
//        }

        List<WebElement> links = driver.findElements(By.partialLinkText("S"));

        WebElement firstLink = links.get(7);
        System.out.println("firstLink.getText() = " + firstLink.getText());

        List<WebElement> links2 = driver.findElements(By.partialLinkText("A"));
        WebElement linkA = links2.get(2);
        System.out.println("linkA.getText() = " + linkA.getText());

        List<WebElement> links3 = driver.findElements(By.partialLinkText("B"));
        WebElement linkB = links3.get(1);
        System.out.println("linkB.getText() = " + linkB.getText());
        driver.quit();


    }
}
