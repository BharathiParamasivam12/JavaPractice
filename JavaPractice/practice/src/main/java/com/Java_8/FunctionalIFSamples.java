package com.Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalIFSamples {
    public static void main(String[] args) {

        // Consumer
        Consumer<String> consumer = s -> System.out.println(s.toLowerCase());
        Consumer<String> consumer2 = s -> System.out.println(s.toUpperCase());
        consumer.accept("Hi HELLO");
        consumer2.accept("How are you?");
        consumer.andThen(consumer2).accept("Iam fine");


        //Predicate

        Predicate<Integer> predicate = (a) -> a > 100;
        System.out.println(predicate.test(10));

        // Function 

        Function<String, Integer> func = (a) -> (a.length());
        System.out.println(func.apply("bharathi"));
      
        // Supplier
        List<Integer> list = Arrays.asList(3,88,96,45);
        Supplier supplier = () -> (list.get(3));
        System.out.println(supplier.get());

    }
}
