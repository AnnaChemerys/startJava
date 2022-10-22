package com.hw;

public class Arrays {
    public static void main(String[] args) {
        int number = 10;
        int [] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
            System.out.println(numbers[i]);
        }

        System.out.println(" ");

        int [] newNumbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < newNumbers.length; i++) {
            System.out.println(newNumbers[i]);
        }
    }
}
