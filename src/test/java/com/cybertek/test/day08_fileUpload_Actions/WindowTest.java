package com.cybertek.test.day08_fileUpload_Actions;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class WindowTest extends TestBase {
    @Test
    public void testWindowOrTab(){
        driver.get("http://practice.cybertekschool.com/windows");
        String currentHundle = driver.getWindowHandle();
        System.out.println("currentHundle = " + currentHundle);
        Set<String> allHundles = driver.getWindowHandles();
        System.out.println("allHundles = " + allHundles);
        WebElement clickHere = driver.findElement(By.linkText("Click Here"));
        clickHere.click();
        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());
        System.out.println("driver.getWindowHandles() = " + driver.getWindowHandles());

        allHundles = driver.getWindowHandles();
        for (String eachHundle : allHundles) {
            System.out.println("eachHundle = " + eachHundle);
            driver.switchTo().window(eachHundle);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }
        driver.switchTo().window(currentHundle);

        Assertions.assertEquals("Practice", driver.getTitle());
        System.out.println("driver.getTitle() = " + driver.getTitle());
    }
}
