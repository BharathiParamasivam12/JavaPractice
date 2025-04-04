package com.Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

import com.Model.Person;
import com.Model.PersonRepo;

public class StreamReduce {
    public static void main(String[] args) {
         BinaryOperator<Integer> bo = (a,b) -> a*b;
     
        List<Integer> list = Arrays.asList(2,8,90,78,9);
        Optional<Integer> sum =list.stream()
            .reduce((a,b) -> a+b);
        System.out.println(sum.get());

        int mul = list.stream().reduce(1,bo);
        System.out.println(mul);

        System.out.println("Concat Names : ");
        concatNames(new PersonRepo().getAllPersons());
        getTallestPerson(new PersonRepo().getAllPersons());
    }

    public static void concatNames(List<Person> list){
       String names = list.stream()
            .map(Person :: getName)
            .reduce("",(a,b)->a.concat(b));
        System.out.println(names);
            
    }

    static void getTallestPerson(List<Person> list){
        Optional<Person> tall = list.stream()
                             .reduce((x,y)-> x.getHeight() > y.getHeight() ? x : y );
        System.out.println("getTallestPerson "+tall.get());
    }
}
