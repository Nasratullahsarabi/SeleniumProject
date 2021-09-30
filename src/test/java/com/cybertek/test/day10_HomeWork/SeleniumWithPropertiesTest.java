package com.cybertek.test.day10_HomeWork;

import com.cybertek.utility.ConfigReader;
import com.cybertek.utility.TestBase;
import com.cybertek.utility.WebOrderUtil;
import org.junit.jupiter.api.Test;

public class SeleniumWithPropertiesTest extends TestBase {

    @Test
    public void testWebOrderLogin(){
        String url = ConfigReader.read("weborder_rul");
        String userName = ConfigReader.read("weborder_userName");
        String password = ConfigReader.read("weborder_password");
        driver.get(url);
        WebOrderUtil.login(userName,password);
        System.out.println("End");
    }
}
