package com.Java_8;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import com.Model.Person;
import com.Model.PersonRepo;

public class StreamMapFilterReduce {
    static Predicate<Person> ageCheck = (person) -> (person.getAge()>30);
    public static void main(String[] args) {
        getAllKidsCount(new PersonRepo().getAllPersons());
    }

    // Get all kids count for age greater than 30 
    public static Optional<Integer> getAllKidsCount(List<Person> personList){
       Optional<Integer> count =  personList.stream() //streams of person
            .filter(ageCheck) // filtered stream of person
            .map(Person :: getKidsCount) // fetch only getcount of kids
            .reduce((x,y)-> x+y); // loop and add all kids count
        System.out.println("total count of kids : "+count.get());
        return count;
    }

}
