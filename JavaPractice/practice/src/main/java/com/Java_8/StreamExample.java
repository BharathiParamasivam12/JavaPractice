package com.Java_8;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.Model.Person;
import com.Model.PersonRepo;

public class StreamExample {
    public static void main(String[] args) {
        PersonRepo personRepo = new PersonRepo();
        List<Person> allPersons = personRepo.getAllPersons();
        Map<String, List<String>> map =  allPersons.stream()
                .filter(p-> p.getAge() >30)
                .collect(Collectors.toMap(Person::getName, Person::getHobbies));
        System.out.println("Map: "+map);

       List<String> hobbList = allPersons.stream() //stream of all persons
               .map(Person::getHobbies) // get all hobbies of each person list
               .flatMap(List :: stream)
               .distinct()
               .collect(Collectors.toList());
        System.out.println("Hobb list "+ hobbList);
    }
    
}
