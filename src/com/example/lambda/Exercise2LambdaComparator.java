package com.example.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise2LambdaComparator {

    public static void main(String[] args) {

        List<Person> personList = Person.createShortList();

        // Sort by surname with Inner Class
        Collections.sort(personList, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.getSurName().compareTo(p2.getSurName());
            }
        });

        System.out.println("=== Sorted PersonList ===");
        for (Person p : personList) {
            p.printDetailInWesternNameStyle();
        }

        // Use Lambda instead for sorting
        // Lambda supports "target typing" which infers the object type from the context in which it is used.
        // Because we are assigning the result to a Comparator defined with a generic, the compiler can infer that the two
        // parameters are of the Person type.
        // NOTE: Similar to Runnable, Comparator is also a functional interface.
        System.out.println("=== Sorted PersonList ===");
        Collections.sort(personList, bySurname());

        // Print the sorted list
        for (Person p : personList) {
            p.printDetailInWesternNameStyle();
        }

    }

    private static Comparator<Person> bySurname() {
        //TODO: Implement this method using Lambda expressions
        return null;//finish this method
    }
}