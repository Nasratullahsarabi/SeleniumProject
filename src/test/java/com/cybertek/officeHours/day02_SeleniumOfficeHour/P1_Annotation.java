package com.cybertek.officeHours.day02_SeleniumOfficeHour;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P1_Annotation extends TestBase {

    @Test
    public void test1() {
        driver.get("https://search.yahoo.com");

        String actualResult = driver.getTitle();
        String expectedResult = "Yahoo Search - Web Search";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test2() {
        driver.get("https://amazon.com");

        String actualResult = driver.getTitle();
        String expectedResult = "Amazon.com. Spend less. Smile more.";

        Assertions.assertEquals(expectedResult, actualResult);
    }
}