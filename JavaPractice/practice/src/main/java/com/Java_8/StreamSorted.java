package com.Java_8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.Model.Person;
import com.Model.PersonRepo;

public class StreamSorted {
    public static void main(String[] args) {
        System.out.println("sort by name : "+sortByName(new PersonRepo().getAllPersons()).toString());
        System.out.println("Sort by age : ");
        sortByAge(new PersonRepo().getAllPersons());

        System.out.println("Sort by age only display name: ");
        sortByAgeGetName(new PersonRepo().getAllPersons());
   
    }

    public static List<Person> sortByName(List<Person> personList){
        return personList.stream()
                .sorted(Comparator.comparing(Person :: getName).reversed())
                .collect(Collectors.toList());
    }

    public static void sortByAge(List<Person> personList){
         personList.stream()
                .sorted(Comparator.comparing(Person :: getAge))
                .forEach(System.out::println);
    }

    public static void sortByAgeGetName(List<Person> personList){
        personList.stream()
               .sorted(Comparator.comparing(Person :: getAge))
               .map(Person :: getName)
               .forEach(System.out::println);
   }


}
