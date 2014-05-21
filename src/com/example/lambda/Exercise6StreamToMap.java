package com.example.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Exercise6StreamToMap {

    public static void main(String[] args) {
        //use get45FibNum to get a list of the first 45 Fibonacci Number
        //sort them using single & parallel stream, and compare their time used

        List <Integer> targetList = get45FibNum();

        long startTimeSingleStream = System.nanoTime();
        targetList = getSortedListWithSingleStream(targetList);
        long timeUsedSingleStream = System.nanoTime()-startTimeSingleStream;
        System.out.println("Time used to sort = " + timeUsedSingleStream +"nano seconds");

        long startTimeParallelStream = System.nanoTime();
        targetList = getSortedListWithParallelStream(targetList);
        long timeUsedParallelStream = System.nanoTime()-startTimeParallelStream;
        System.out.println("Time used to sort = " + timeUsedParallelStream +"nano seconds");

    }

    //TODO: Get targetList sorted using Parallel Stream
    protected static List<Integer> getSortedListWithParallelStream(List<Integer> targetList) {
        return null;//finish the statement here
    }
    //TODO: Get targetList sorted using Single Stream
    protected static List<Integer> getSortedListWithSingleStream(List<Integer> targetList) {
        return null;//finish the statement here
    }

    //returning the first 45 Fibonacci numbers
    private static List<Integer> get45FibNum(){
        List<Integer> targetList = new ArrayList<>();

        for (int i = 45; i >0; i--){
            targetList.add(fibi(i));
        }
        return targetList;
    }

    private static int fibi(int num)
    {
        int initial =0; int addToInitial = 1;
        int keepInitial = 0;

        for(int i = 0; i <num; i++)
        {
            keepInitial = initial;
            initial = addToInitial;
            addToInitial = keepInitial + addToInitial;
        }
        return initial;
    }

}
