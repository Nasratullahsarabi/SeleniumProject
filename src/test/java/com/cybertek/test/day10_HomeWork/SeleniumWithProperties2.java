package com.cybertek.test.day10_HomeWork;

import com.cybertek.utility.ConfigurationReader;
import com.cybertek.utility.TestBase;
import com.cybertek.utility.WebOrderUtil;
import org.junit.jupiter.api.Test;

public class SeleniumWithProperties2 extends TestBase {

    @Test
    public void testOrderLogin(){

//        String url = ConfigurationReader.read("weborder_url");
//        String user = ConfigurationReader.read("weborder_userName");
//        String pass = ConfigurationReader.read("weborder_password");
//        System.out.println("url = " + url);
//        System.out.println("user = " + user);
//        System.out.println("pass = " + pass);
//        driver.get(url);
//        WebOrderUtil.login(user,pass);

        driver.get(ConfigurationReader.read("weborder_url"));
        WebOrderUtil.login(ConfigurationReader.read("weborder_userName"), ConfigurationReader.read("weborder_password"));


    }
}
