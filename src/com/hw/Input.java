package com.hw;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type something into the console");
        String string = scanner.nextLine();
        System.out.println("You entered \n" + string);
    }
}
