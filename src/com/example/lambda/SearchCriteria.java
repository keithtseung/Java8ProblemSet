package com.example.lambda;

import java.util.function.Predicate;

public class SearchCriteria {

    //Please use this style to define the predicate we need in Exercise 4
    public static Predicate<Person> allDrivers() {
        return p -> p.getAge() >= 16;
    }


    public static Predicate<Person> allDraftees() {
        return p -> p.getAge() >= 18 && p.getAge() <= 25 && p.getGender() == Gender.MALE;
    }

    public static Predicate<Person> allPilots() {
        return p -> p.getAge() >= 23 && p.getAge() <= 65;
    }

}
