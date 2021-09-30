package com.cybertek.practice08;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.Set;

public class WindowTab extends TestBase {
    @Test
    public void windowTab(){
        driver.get("http://practice.cybertekschool.com/windows");
        String currentHundle = driver.getWindowHandle();
        System.out.println("currentHundle = " + currentHundle);
        Set<String> allHundles = driver.getWindowHandles();
        System.out.println("allHundles = " + allHundles);
        driver.findElement(By.linkText("Click Here")).click();
        BrowserUtil.waitFor(2);

        System.out.println("After clicked = " + driver.getWindowHandle());
        System.out.println("After clicked all = " + driver.getWindowHandles());

        driver.switchTo().window(currentHundle);
        BrowserUtil.waitFor(2);
        driver.findElement(By.linkText("Click Here")).click();
        System.out.println("---------------------------------------------");
        System.out.println("After clicked all = " + driver.getWindowHandles());
        System.out.println("------------Loop---------------------------------");

        allHundles = driver.getWindowHandles();
        for (String eachHundle : allHundles) {
            System.out.println("eachHundle = " + eachHundle);
            BrowserUtil.waitFor(2);
            driver.switchTo().window(eachHundle);
            System.out.println("driver.getTitle() = " + driver.getTitle());

        }


        BrowserUtil.waitFor(3);

    }
}
