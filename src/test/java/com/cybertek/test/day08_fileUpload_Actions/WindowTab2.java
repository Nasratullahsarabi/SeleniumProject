package com.cybertek.test.day08_fileUpload_Actions;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.Set;

public class WindowTab2 extends TestBase {
    @Test
    public void windowTab(){
        driver.get("http://practice.cybertekschool.com/windows");
        String currentHundle = driver.getWindowHandle();

        System.out.println("currentHundle = " + currentHundle);
        driver.findElement(By.linkText("Click Here")).click();
        Set<String> allHundles = driver.getWindowHandles();
        System.out.println("allHundles = " + allHundles);
        BrowserUtil.waitFor(3);
        driver.switchTo().window(currentHundle);
        BrowserUtil.waitFor(3);
    }
}
