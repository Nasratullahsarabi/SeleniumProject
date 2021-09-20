package com.cybertek.test.day06_junit_practice_unitily;

import com.cybertek.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableXPathPracticeTest extends TestBase {

    @Test
    public void testTableData(){
        driver.get("http://practice.cybertekschool.com/tables");
        WebElement cell4 = driver.findElement(By.xpath("//table[@id='table1']//td[.='Jason']"));
        System.out.println("cell4.getText() = " + cell4.getText());
    }
}
