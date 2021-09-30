package com.cybertek.test.day09_explicitWait;

import com.cybertek.utility.BrowserUtil;
import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait3 extends TestBase {
@Test
    public void expWait(){
    driver.get("http://practice.cybertekschool.com/dynamic_loading");
    driver.findElement(By.partialLinkText("Example 7:")).click();
    WebDriverWait wait = new WebDriverWait(driver,5);
    wait.until(ExpectedConditions.titleIs("Dynamic title"));

      }

      @Test
    public void expWait2(){
          driver.get("http://practice.cybertekschool.com/dynamic_loading");
          driver.findElement(By.partialLinkText("Example 7:")).click();

          WebDriverWait wait = new WebDriverWait(driver, 5);
          WebElement msg = driver.findElement(By.xpath("//div[@id='alert']"));
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='square pants']")));


      }

      @Test
    public void expWait3(){
          driver.get("http://practice.cybertekschool.com/dynamic_loading");
          driver.findElement(By.partialLinkText("Example 7:")).click();
          WebDriverWait wait = new WebDriverWait(driver,5);

          wait.until(ExpectedConditions.textToBe(By.id("alert"), "Done!"));
          BrowserUtil.waitFor(2);
          WebElement msg = driver.findElement(By.id("alert"));
          System.out.println("msg.getText() = " + msg.getText());
          BrowserUtil.waitFor(2);

      }
}
