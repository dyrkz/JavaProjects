package com.company;

public class Main {

    public static void main(String[] args) {
        // Classes and Objects

        // Object
        Lens lensOne = new Lens("Sony", "85mm", true);

        Lens lensTwo = new Lens("Sony", "30mm", true);

        Lens lensThree = new Lens("Canon", "24-75mm", false);

        System.out.println("Lens 1");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println("Prime lens: " + lensOne.isPrime);
        System.out.println();

        System.out.println("Lens 2");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println("Prime lens: " + lensTwo.isPrime);
        System.out.println();

        System.out.println("Lens 3");
        System.out.println(lensThree.brand);
        System.out.println(lensThree.focalLength);
        System.out.println("Prime lens: " + lensThree.isPrime);
        System.out.println();
    }
    // Class
    static class Lens {
        // bunch of properties / attributes
        String brand;
        String model;
        String color;
        double price;
        double weight;
        String focalLength;
        boolean isPrime;

        Lens(String brand, String focalLength, boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;

        }
    }
}
