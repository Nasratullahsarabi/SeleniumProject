package com.cybertek.test.day06_junit_practice_unitily;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YahooSearchTest extends TestBase {

    @Test
    public void testYahooSearchHomePage(){
        driver.get("https://search.yahoo.com");
        String expectedTitle = "Yahoo Search - Web Search";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle,actualTitle);
    }
    @Test
    public void testYahooSearchResultPage() throws InterruptedException {
        driver.get("https://search.yahoo.com");
        driver.findElement(By.name("p")).sendKeys("Selenium"+ Keys.ENTER);
        Thread.sleep(1000);

        assertTrue(driver.getTitle().startsWith("Selenium"));
    }
}
