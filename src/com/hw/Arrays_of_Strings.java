package com.hw;

public class Arrays_of_Strings {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        numbers[0] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        int[] newNumbers = {1, 2, 3};
        int sum = 0;

        for (int newNumber: newNumbers) {
            sum += newNumber;
        }

        System.out.println("");
        System.out.println("Sum of new numbers = " + sum);
        System.out.println("");

        String[] strings = new String[3];
        strings[0] = "hello";
        strings[1] = "bye";
        strings[2] = "Java";

        for (int i = 0; i < strings.length; i++) {
            System.out.println("forI " + strings[i]);
        }

        System.out.println("");

        for (String string: strings) {
            System.out.println("forEach " + string);
        }
    }
}
