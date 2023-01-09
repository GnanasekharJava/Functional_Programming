package com.java17.functional.programming;

import java.util.List;

public class FP01Example {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 41, 50, 60, 71, 80, 90, 100);

        List<String> courses = List.of("Spring", "Spring Boot", "devops", "Cloud", "API", "AWS", "AZURE", "Microservices", "Hello");
       // printListOfEvenNumbers(numbers);
       // printListOfOddNumbers(numbers);
        // printOnlySpringCourses(courses);
       // printListOfSquaresForNumbers(numbers);
        printOnlySpringCoursesLength(courses);
    }

    private static void printOnlySpringCoursesLength(List<String> courses) {
        courses.stream().map(String::length).filter(length -> length >= 10).forEach(System.out::println);
    }

    private static void printListOfSquaresForNumbers(List<Integer> numbers) {
        numbers.stream().filter(number -> number%3 == 1).map(number -> number * number).forEach(System.out::println);
    }

    private static void printOnlySpringCourses(List<String> courses) {
       // courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
        courses.stream().filter(course -> course.length() == 3).forEach(System.out::println);
    }

    private static void printListOfEvenNumbers(List<Integer> numbers) {
        numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
    }

    private static void printListOfOddNumbers(List<Integer> numbers) {
        numbers.stream().filter(number -> number % 2 == 1).forEach(System.out::println);
    }
}
