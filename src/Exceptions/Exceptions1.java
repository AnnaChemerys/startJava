package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) {
        File file = new File("test");

        try {
            Scanner scanner = new Scanner(file);

            System.out.println("After Scanner");
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception");
        }

        System.out.println("After try/catch");
    }
}
