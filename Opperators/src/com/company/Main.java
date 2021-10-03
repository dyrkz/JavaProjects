package com.company;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;   // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;    // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 5;    // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        int zero = 0;
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int five = 5;
        int six = 6;
        int seven = 7;
        int eight = 8;
        int nine = 9;
        int ten = 10;

        int addition = ten + two;
        System.out.println(addition);
        System.out.println(10 * 6 / 2 - 6 + 6);
        System.out.println(5 % 2);
        System.out.println(Math.max(3.5, 10.22));
        System.out.println((int) Math.pow(5, 5));
        System.out.println((int) Math.sqrt(34059));
        System.out.println(Math.sin(69));

        // Data Type
        // Primitive types and Reference types (complex data type)
        double number = 100.01;
        String brand = "WizardHat";
        Date date = new Date(); //new = reference type
        System.out.println(date);
        byte minByte = -128;
        byte maxByte = 127;

        String name = new String("WizardHad");
        System.out.println(name.toUpperCase());
        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());

        double pi = 3.1415;

        int subscriberCount = 1_000_000;

        Person alex = new Person("Alex");
        Person martin = alex;

        System.out.println("before changing alex");
        System.out.println(alex.name + " " + martin.name);
        System.out.println(alex.name.charAt(0));

        alex.name = "Martin";

        System.out.println("after changing alex");
        System.out.println(alex.name + " " + martin.name);

        Camus cat = new Camus("Cat");
        System.out.println(cat.camoo);
        String at = new String("at");
        System.out.println(cat.camoo.contains(at));

        Shaman Yao = new Shaman("Howmyspose to take a nap");
        System.out.println(Yao.name);

        int khalidAge = 18;
        int mariamAge = 22;
        boolean isKhalidOlderThanMariam = khalidAge > mariamAge;
        System.out.println(isKhalidOlderThanMariam);
        System.out.println(khalidAge < mariamAge);
        System.out.println(mariamAge == khalidAge);
        System.out.println(mariamAge != (mariamAge | khalidAge));

        boolean isCute = true;
        boolean isAdult = false;
        boolean isStudent = true;
        System.out.println(isAdult && isStudent);
        System.out.println((isAdult || !isStudent) && isCute);
        System.out.println(isCute == true);
        System.out.println(!isCute);
        System.out.println(isCute);
        System.out.println(10 > 8 || 2 <= 2 && isAdult && name.contains("M"));

        int age = 15;
        if (age >= 18) {
            System.out.println("I am an adult");
        } else if (age >= 16 && age < 18) {
            System.out.println("I am almost an adult");
        } else {
            System.out.println("I am not an adult");
        }

        int agei = 15;
        String message = agei >= 18 ?
                "Hooray... I am an adult" :
                "I am not an adult";
        System.out.println(message);



        String gender = "FEMALE";
        if (gender.equals("FEMALE")) {

        } else if (gender.equals("MALE")) {

        } else if (gender.equals("PREFER_NOT_SAY")) {

        } else {

        }

        switch (gender.toUpperCase()) {
            case "FEMALE":
                System.out.println("I am a female");
                break;
            case "MALE":
                System.out.println("I am a male");
                break;
            case "PREFER_NOT_SAY":
                System.out.println("I prefer not to say");
                break;
            default:
                System.out.println("Unknow gender");
        }

        // Arrays
        int zero0 = 0;
        int one1 = 1;

        int [] numbers = new int [3]; // initialise size to 3
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 346;
        System.out.println(Arrays.toString(numbers));

        String [] names = {"Martin", "Maria", "Alinity"};
        int [] numberz = {2, 0, 1, 323, 100};
        System.out.println(Arrays.toString(numberz));
        System.out.println(numberz.length);
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);
        int oneHundred = numberz[4];
        System.out.println(oneHundred);

    }

    static class Shaman {
        String name;

        Shaman(String name) {
            this.name = name;
        }

    }
    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }

    }

    static class Camus {
        String camoo;

        Camus(String camoo) {
            this.camoo = camoo;
        }
    }

    static class Spirit {
        Person soul;

        Spirit(Person soul) {
            this.soul = soul;
        }

    }

}
