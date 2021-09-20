package com.cybertek.test.day05_css_xpath_junit5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YahooSearchPageTest {
    WebDriver driver;

    @BeforeAll
    public static void setUpDriver(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setupWebDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }

    // write 2 tests :
    // testYahooSearchHomePageTitle
    //
    //    test when you navigate to yahoo search page
    //        the title should be "Yahoo Search - Web Search"

    @AfterAll
    public static void teardown(){
        System.out.println("After all, nothing to do here");
    }

    @Test
    public void testYahooSearchHomePageTitle(){
        driver.get("https://search.yahoo.com/");
        String expectedTitle = "Yahoo Search - Web Search";
        String actualTitle = driver.getTitle();

        assertEquals(expectedTitle, actualTitle);
    }
    // test method name : testYahooSearchResultPageTitle
    // test navigate to yahoo page
    // and search for Selenium
    // the page title should start with selenium

    @Test
    public void testYahooSearchPageTitle(){
        driver.get("https://search.yahoo.com/");
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='p']"));

        searchBox.sendKeys("Selenium"+ Keys.ENTER);

       // String expectedTitle = "Selenium";
        String actualTitle = driver.getTitle();

        assertTrue(actualTitle.startsWith("Selenium"));
    }


}
