package com.java17.functional.programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FP03Example {
    public static void main(String[] args){
        Integer[] list = {12,4,5,9,12,8,9,13,8,5};
       List<Integer> numbers = Arrays.asList(list);

       numbers.stream().sorted().forEach(System.out::println);
        List l= Collections.singletonList(numbers.stream().map(x -> x * x * x).reduce(0, Integer::sum));
        System.out.println(l);
    }


}
