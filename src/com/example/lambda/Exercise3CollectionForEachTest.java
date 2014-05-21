package com.example.lambda;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Exercise3CollectionForEachTest {

    @Test
    public void shouldAddAgeByThree() {
        List<Person> targetList = Person.createShortList();
        List<Person> controlList = Person.createShortList();

        Exercise3CollectionForEach.increaseAgeByThree(targetList);

        assertEquals(controlList.get(0).getAge() + 3, targetList.get(0).getAge());
    }

}