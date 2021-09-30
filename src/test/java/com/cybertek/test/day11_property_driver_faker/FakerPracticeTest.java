package com.cybertek.test.day11_property_driver_faker;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

public class FakerPracticeTest {

    @Test
    public void testPrintFakeData(){

        Faker faker = new Faker();
        System.out.println("faker.name().lastName() = " + faker.name().fullName());
        System.out.println("faker.book() = " + faker.book().title());
        System.out.println("faker.phoneNumber().cellPhone() = " + faker.phoneNumber().cellPhone());
        System.out.println("faker.chuckNorris() = " + faker.chuckNorris().fact());
        System.out.println("faker.country().capital() = " + faker.country().capital());
    }
}
