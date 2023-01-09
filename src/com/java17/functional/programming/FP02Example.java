package com.java17.functional.programming;

import java.util.List;

public class FP02Example {

    public static void main(String[] args){
        List<Integer> numbers = List.of(10, 20, 30, 41, 47, 60, 71, 80, 90, 100);

        //int sum = numbers.stream().reduce(0,Integer::sum);

        int sum = numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println("The total sum is" + " " + sum);
    }
}
