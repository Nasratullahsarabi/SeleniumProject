package com.cybertek.test.day05_css_xpath_junit5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LifeCycleAnnotionDemo {

    @AfterAll
    public void cleanUp(){
        System.out.println("After all is running");
    }

    @BeforeAll
    public void beforeAll(){
        System.out.println("Before all is running");
    }
    @Test
    public void test1(){
        System.out.println("Test 1 is running");
    }
    @Test
    public void test2(){
        System.out.println("Test 2 is running");
    }
}
