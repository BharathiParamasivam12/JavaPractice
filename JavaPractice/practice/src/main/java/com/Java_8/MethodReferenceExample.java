package com.Java_8;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MethodReferenceExample {
    public static int add(int a, int b){
        return a+b;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
     BiConsumer<Integer,Integer> biConsumer =  MethodReferenceExample::add;
     biConsumer.accept(10,10);


    }
}
