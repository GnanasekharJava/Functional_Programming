package com.java17.functional.programming;

import java.util.Comparator;
import java.util.List;

public class FP04Example {
    public static void main(String[] args){

        List<String> courses = List.of("Spring", "Spring Boot", "devops", "Cloud", "API", "AWS", "AZURE", "Microservices", "Hello");

        courses.stream().map(String::toUpperCase).sorted(Comparator.comparing(String::length)).forEach(System.out::println);

    }
}
