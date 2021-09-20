package com.cybertek.practice04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsByCssSelector {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver() ;
        driver.get("https://search.yahoo.com/");

        // <input type="text" class="sbq" id="yschsp" name="p" value="" autocomplete="off" role="combobox">

//        WebElement element = driver.findElement(By.cssSelector("#yschsp"));
//        WebElement element = driver.findElement(By.cssSelector("input[name='p']"));
        //WebElement element = driver.findElement(By.cssSelector("input[type='text']"));
        WebElement element = driver.findElement(By.cssSelector("input[role='combobox']"));
//        WebElement element = driver.findElement(By.cssSelector("input[id='yschsp']"));

        element.sendKeys("Java");
        Thread.sleep(1000);

        WebElement clearIcon = driver.findElement(By.cssSelector("button#sbq-clear>span"));
        clearIcon.click();
        Thread.sleep(1000);
        element.sendKeys("python");
        Thread.sleep(1000);
        WebElement searchBtn = driver.findElement(By.cssSelector("span[title='Search']"));
        searchBtn.click();
        Thread.sleep(3000);
        driver.quit();

    }
}
