package com.hw;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        switch (age) {
            case 0 :
                System.out.println("You were just born");
                break;
            case 7 :
                System.out.println("You went to school");
                break;
            case 18 :
                System.out.println("You finished school");
                break;
            default:
                System.out.println("None of the conditions matched");
        }
    }
}
