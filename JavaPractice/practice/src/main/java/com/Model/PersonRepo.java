package com.Model;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.Model.Person;

public class PersonRepo {
    private List<Person> persons;

    public PersonRepo() {
        persons = new ArrayList<>();
        persons.add(new Person("anu", 23, 157, Arrays.asList("Music", "Reading"),3));
        persons.add(new Person("bharathi", 33, 159, Arrays.asList("Painting", "Reading"),1));
        persons.add(new Person("dhilip", 37, 169, Arrays.asList("Dance", "Drawing"),3));
        persons.add(new Person("farina", 28, 130, Arrays.asList("Singing", "Reading"),4));
        persons.add(new Person("geetha", 19, 164, Arrays.asList("Painting", "Reading"),1));
        persons.add(new Person("mahathi", 26, 124, Arrays.asList("Painting", "Dance"),2));
    }

    public List<Person> getAllPersons() {
        return persons;
    }
}