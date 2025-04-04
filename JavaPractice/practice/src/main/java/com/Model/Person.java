package com.Model;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private int height;
    private List<String> hobbies;
    private int kidsCount;

    Person(String name, int age, int height, List<String> hobbies, int kidsCount){
        this.name = name;
        this.age = age;
        this.height = height;
        this.hobbies = hobbies;
        this.kidsCount = kidsCount;
    }

      // Getter for name
      public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Getter for height
    public int getHeight() {
        return height;
    }

    // Getter for hobbies
    public List<String> getHobbies() {
        return hobbies;
    }

    public int getKidsCount(){
        return kidsCount;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", hobbies=" + hobbies +
                ", kidsCount=" + kidsCount +
                '}';
    }

}
