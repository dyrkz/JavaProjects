package com.company;

import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // Methods
        char[] letters = {'A', 'B', 'A', 'C', 'D', 'D', 'D'};
        String [] names = {"Martin", "Monique", "Steph", "Caymus", "Pax", "Sacha", "Alexa"};
        int count = countOccurrences(letters, 'A');
        System.out.println(count);
    }

    public static int countOccurrences(char [] letters, char searchLetter) {

        int count = 0;
        for (char letter : letters) {
            if (letter == searchLetter) {
                count++;
            }
        }

        System.out.println(Arrays.toString(letters));
        System.out.println(searchLetter);
        System.out.println("method countOccurrences was invoked");
        return count;
    }

}
