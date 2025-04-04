package com.Java_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.Model.Person;
import com.Model.PersonRepo;

public class StreamFilter {

    static Predicate<Person> height = per -> per.getHeight()>150;
    static Predicate<Person> hobbies = pers -> pers.getHobbies().contains( "Reading");
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Anderson","Carel","Michelle","Alex");
        List<String> updatedName = list.stream()
                                    .filter(len -> len.length()>5)
                                    .toList();
        System.out.println(updatedName);

        checkHeightValue(new PersonRepo().getAllPersons());
    }

    public static void checkHeightValue(List<Person> list){
            list.stream()
                .filter(height.and(hobbies))
                .forEach(System.out::println);
    }
}
