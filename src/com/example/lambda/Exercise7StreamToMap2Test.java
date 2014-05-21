package com.example.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Exercise7StreamToMap2Test {

    @Test
    public void shouldAdjustTaxBy12Percent(){
        List<Double> costsBeforeTax = Arrays.asList(100d, 200d, 300d, 400d, 500d);
        List<Double> costsAfterTax = Exercise7StreamToMap2.getCostAfterTax(costsBeforeTax);

        assertEquals(112d,costsAfterTax.get(0),0.000001);
    }
}