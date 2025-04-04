package com.Java_8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.Model.Person;
import com.Model.PersonRepo;

public class StreamFlatMap {
    public static void main(String[] args) {
        List<Integer> odd = Arrays.asList(1,5,9,7);
        List<Integer> even = Arrays.asList(2,6,8,4);
        List<List<Integer>> oddEven = Arrays.asList(odd,even);
        System.out.println(oddEven); // List of list 

        // To flatten

        List<Integer> oddEvenList = oddEven.stream()
                                    .flatMap(List :: stream)
                                    .sorted()
                                    .collect(Collectors.toList());

        System.out.println(oddEvenList);

        System.out.println("List all the hobbies : "+getAllHobbiesmList(new PersonRepo().getAllPersons()));
        System.out.println("List all the hobbies count : "+getAllHobbiesmListCount(new PersonRepo().getAllPersons()));
        

    }

    public static List<String> getAllHobbiesmList(List<Person> persons){
            return persons.stream() //stream of persons
                    .map(Person::getHobbies)  // get list of hobbies for each person
                    .flatMap(List :: stream) // convert list of hobbies into stream 
                    .distinct()
                    .sorted()
                    .collect(Collectors.toList()); // collect the stream in list 
    }
    
    public static long getAllHobbiesmListCount(List<Person> persons){
        return persons.stream() //stream of persons
                .map(Person::getHobbies)  // get list of hobbies for each person
                .flatMap(List :: stream) // convert list of hobbies into stream 
                .count();
              
}

}
