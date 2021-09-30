package com.cybertek.practice08;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.Set;

public class WindowsTab2 extends TestBase {

    @Test
    public void practice(){
        driver.get("http://practice.cybertekschool.com/windows");

        String currentHundle = driver.getWindowHandle();
        System.out.println("currentHundle = " + currentHundle);
        driver.findElement(By.linkText("Click Here")).click();
        BrowserUtil.waitFor(2);
        driver.switchTo().window(currentHundle);
        BrowserUtil.waitFor(2);
        driver.findElement(By.linkText("Click Here")).click();
        BrowserUtil.waitFor(3);
        Set<String> allHundles = driver.getWindowHandles();
        System.out.println("allHundles = " + allHundles);
        System.out.println("---------------------------------");
        allHundles = driver.getWindowHandles();

        for (String eachHundle : allHundles) {
            System.out.println("eachHundle = " + eachHundle);
            BrowserUtil.waitFor(2);
            driver.switchTo().window(eachHundle);
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }
    }
}
