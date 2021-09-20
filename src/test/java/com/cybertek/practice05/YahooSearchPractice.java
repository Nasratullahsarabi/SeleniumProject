package com.cybertek.practice05;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YahooSearchPractice {
    WebDriver driver;

    @BeforeAll
    public static void driverSetup(){
        WebDriverManager.chromedriver().setup();
    }
    @AfterAll
    public static void end(){
        System.out.println("End of the test");
    }
    @BeforeEach
    public void webDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterEach
    public void quitWindow() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void googlePageTitle(){
        driver.get("https://google.com");
        String expectedResult = "Google";
        String actualResult = driver.getTitle();

        assertEquals(actualResult, expectedResult);
        assertTrue(actualResult.startsWith("Google"));
    }
    @Test
    public void javaSearch() throws InterruptedException {
        driver.get("https://google.com");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Java"+ Keys.ENTER);
        Thread.sleep(3000);
        String actualResult = driver.getTitle();
        String expectedResult = "Java - Google Search";

        assertEquals(actualResult,expectedResult);
        assertTrue(actualResult.startsWith("Java"));

    }
    @Test
    public void wikiPedia(){
        //Wikipedia, the free encyclopedia

        driver.get("https://en.wikipedia.org/wiki/Main_Page");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Wikipedia, the free encyclopedia";

        assertEquals(actualTitle,expectedTitle);
        assertTrue(actualTitle.startsWith("Wikipedia"));
    }
    @Test
    public void wekiPediaSearch(){
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Python"+Keys.ENTER);
        //Python - Wikipedia
        String actualTitle = driver.getTitle();
        String expectedTitle = "Python - Wikipedia";
        assertEquals(actualTitle,expectedTitle);
        assertTrue(actualTitle.startsWith("Python"));
    }

}
