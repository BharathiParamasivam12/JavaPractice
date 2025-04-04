package com.Java_8;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.Model.Person;
import com.Model.PersonRepo;

public class StreamMap {

    static Function<Person,String> f1 = person -> person.getName();
    public static List<String> nameTransform(List<Person> personList){
        return personList.stream()      //list of stream
                .map(Person :: getName) // string of each person
                .map(String :: toUpperCase)
                .collect(Collectors.toList());

    }

    public static List<String> nameTransformLower(List<Person> personList){
        return personList.stream()      //list of stream
                .map(f1) // string of each person
                .map(String :: toLowerCase)
                .collect(Collectors.toList());

    }
    public static void main(String[] args) {
        System.out.println(StreamMap.nameTransform(new PersonRepo().getAllPersons()));
        System.out.println(StreamMap.nameTransformLower(new PersonRepo().getAllPersons()));
    }
}
