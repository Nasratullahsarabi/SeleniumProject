package com.cybertek.test.day10_HomeWork;

import com.cybertek.utility.ConfigurationReader;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReadTest2 {

    @Test
    public void testInitialRead2() throws IOException {

        FileInputStream in = new FileInputStream("config.properties");
        Properties myProperty = new Properties();
        myProperty.load(in);
        in.close();
        String helloValue = myProperty.getProperty("hello");
        System.out.println("helloValue = " + helloValue);

    }

    @Test
    public void msg() throws IOException{
        FileInputStream in = new FileInputStream("config.properties");
        Properties properties = new Properties();
        properties.load(in);
        in.close();
        System.out.println("properties.getProperty(\"message\") = " + properties.getProperty("message"));
    }

    @Test
    public void testUrl() throws IOException{
        FileInputStream in = new FileInputStream("config.properties");
        Properties prop = new Properties();
        prop.load(in);
        in.close();
        System.out.println("prop.getProperty(\"weborder_url\") = " + prop.getProperty("weborder_url"));
        System.out.println("prop.getProperty(\"weborder_userName\") = " + prop.getProperty("weborder_userName"));
        System.out.println("prop.getProperty(\"weborder_password\") = " + prop.getProperty("weborder_password"));
        System.out.println("prop.getProperty(\"browser\") = " + prop.getProperty("browser"));
    }

    @Test
    public void testWithTryandCatch(){

        try {
            FileInputStream in = new FileInputStream("config.properties");

            Properties prop = new Properties();
            prop.load(in);
            in.close();
            System.out.println("prop.getProperty(\"hello\") = " + prop.getProperty("hello"));

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void testReadingUtilityClass(){

        System.out.println("ConfigurationReader.read(\"hello\") = " + ConfigurationReader.read("hello"));
        System.out.println("ConfigurationReader.read(\"weborder_userName\") = " + ConfigurationReader.read("weborder_userName"));
    }

}
