package com.example.lambda;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercise5StreamToListTest {
    @Test
    public void shouldGetPilotList(){
        List<Person> sampleList = Person.createShortList();

        List<Person> targetList = Exercise5StreamToList.getPilotList(sampleList);

        targetList.forEach((Person) -> assertTrue(isPilot(Person)));
    }

    private boolean isPilot(Person Person) {
        return Person.getAge() >= 23 && Person.getAge() <= 65;
    }

}