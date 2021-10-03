package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);

        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You were born in " + year);

        if (age < 18) {
            System.out.println("and you are not an adult");
        } else {
            System.out.println("and you are an adult");
        }
    }
}
