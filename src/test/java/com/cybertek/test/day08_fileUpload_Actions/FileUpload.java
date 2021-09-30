package com.cybertek.test.day08_fileUpload_Actions;


import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends TestBase {
    @Test
    public void uploadFile() {
        driver.get("http://practice.cybertekschool.com/upload");
        WebElement filePathInput = driver.findElement(By.id("file-upload"));
        String filePath = "C:\\Users\\Nasra\\OneDrive\\Desktop\\Screen_Shot.png";
        filePathInput.sendKeys(filePath);
        driver.findElement(By.id("file-submit")).click();
        //Thread.sleep(3000);

        String expectedResult = driver.findElement(By.xpath("//h3[.='File Uploaded!']")).getText();
        String actualResult = "File Uploaded!";

        Assertions.assertEquals(expectedResult,actualResult);
    }
}
