package com.cybertek.practice05;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class FileUpload extends TestBase {


    @Test
    public void fileUpload() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/upload");
        String filePath = "C:\\Users\\Nasra\\OneDrive\\Desktop\\Screen_Shot_2021-09-13_at_4.54.09_PM.png";
        driver.findElement(By.id("file-upload")).sendKeys(filePath);
        driver.findElement(By.id("file-submit")).click();

        Thread.sleep(5000);

    }
}
