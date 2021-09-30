package com.cybertek.test.day09_explicitWait;

public class SingletonPractice {

    private static Singleton obj;

    private SingletonPractice() {
    }

    public static Singleton getObj() {
        if (obj == null){
            System.out.println("Object has not been created yet, creating one now");
            obj = new Singleton();
            return obj;
        }else {
            System.out.println("You already have object, use that existing object");
            return obj;
        }

    }
}
