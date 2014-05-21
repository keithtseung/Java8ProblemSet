package com.example.lambda;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercise4StreamFilterByPredicateTest {

    @Test
    public void shouldIncreaseDrafteeAgeByThree() {
        List<Person> targetList = Person.createShortList();

        Exercise4StreamFilterByPredicate.increaseDrafteeAgeByThree(targetList);

        assertTrue(isDraftee(targetList.get(0)));
    }

    private boolean isDraftee(Person person) {
        return person.getAge() >= 21 && person.getAge() <= 28 && person.getGender() == Gender.MALE;
    }
}