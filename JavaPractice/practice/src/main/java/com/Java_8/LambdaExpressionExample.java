package com.Java_8;


public class LambdaExpressionExample{
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is the way of calling runnable thread before java 8");
            }
        };
        new Thread(runnable).start();


        // Other way 
             new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread creation way of runnable");
                }               
        }).start();

        // In java 8 

        Runnable t2 = () -> System.out.println("This is the way of calling runnable in java 8 using lamda");
        new Thread(t2).start();


        // way of thread in java 8

        new Thread(()-> {
            System.out.println("This is the way of thread creation in java 8 - thread 2");
        }).start();
    }
}
