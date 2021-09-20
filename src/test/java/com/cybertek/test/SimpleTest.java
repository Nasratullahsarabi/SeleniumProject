package com.cybertek.test;

import org.junit.jupiter.api.*;

public class SimpleTest {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Befor all runs");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("runs after all test");
    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("before each");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("after each");
    }

    @Test
    public void testAddition(){
        System.out.println("hello world");

        int num1 = 2;
        int num2 = 3;
        int expectedResult = 5;
        Assertions.assertEquals(expectedResult,num1+num2);
    }
    @Test
    public void testString(){
        String name = "Nasrat";
        Assertions.assertEquals("Nasrat", name);
        System.out.println("test passed");
    }


}
