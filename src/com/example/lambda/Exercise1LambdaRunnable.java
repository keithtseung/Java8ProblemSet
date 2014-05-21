package com.example.lambda;


public class Exercise1LambdaRunnable {
    public static void main(String[] args) {

        System.out.println("=== Exercise1LambdaRunnable ===");

        // Anonymous Runnable
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world one!");
            }
        };

        // Define Runnable instance using Lambda

        // Hint:
        // The Runnable interface is a functional interface.
        // A functional interface is any interface that contains only one abstract method.
        // (A functional interface may contain one or more default methods or static methods.)
        // Because a functional interface contains only one abstract method,
        // you can omit the name of that method when you implement it.

        Runnable r2 = null;//TODO: implement this assignment statement such that it says Hello world two when we run r2

        // Run them
        r1.run();
        r2.run();

    }
}
