package com.hw;

public class StringFormattingClass {
    public static void main(String[] args) {
        System.out.print("Hello");
        System.out.println(" hello again");
        System.out.printf("This is a string, %s", "NICE \n");
        System.out.printf("String %10d \n", 532);
        System.out.printf("String %10d \n", 5);
        System.out.printf("String %10d \n", 100000);
        System.out.printf("String %10d \n", 1000000000);
        System.out.printf("String %.2f \n", 5.666666666);
    }
}
