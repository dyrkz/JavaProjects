package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Arrays
        int[] numbers = {2, 0, 1 ,4 , 100, 4, 90, 78, 77};

        String[] names = {"anna", "martin", "bob", "Mike"};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Enhanced for loop
        for (int number : numbers) {
            System.out.println(number);
        }

        for (String name : names) {
            if (name.startsWith("m")) {
                continue;
            }
            System.out.println(name);
        }

        Arrays.stream(numbers).forEach(System.out::println);

        // While loop
        int count = 0;

        while (count <= 20) {
            System.out.println("Count: " + count);
            count++;
        }

        int cho = 0;

        do{
            System.out.println(cho);
            cho++;
        }
        while (cho <= 20);
    }
}
