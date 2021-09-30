package com.cybertek.test.day10_HomeWork;

import com.cybertek.utility.ConfigReader;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReadTest {
    @Test
    public void testInitialRead() throws IOException {
        FileInputStream in = new FileInputStream("config.properties");
        Properties myProperty = new Properties();
        myProperty.load(in);
        in.close();
        String helloValue = myProperty.getProperty("hello");
        System.out.println("helloValue = " + helloValue);
        System.out.println("myProperty.getProperty(\"message\") = " + myProperty.getProperty("message"));
        System.out.println("myProperty.getProperty(\"weborder_rul\") = " + myProperty.getProperty("weborder_url"));
    }

    @Test
    public void testReadWithTryCatch() throws IOException {
        try {
            FileInputStream in = new FileInputStream("config.properties");
            Properties properties = new Properties();
            properties.load(in);
            in.close();
            System.out.println("properties.getProperty(\"hello\") = " + properties.getProperty("hello"));
        }catch (IOException e){
            e.printStackTrace();

        }
    }

    @Test
    public void testReadingUtilityClass(){
        System.out.println("ConfigReader.read(\"hello\") = " + ConfigReader.read("hello"));
    }
}
