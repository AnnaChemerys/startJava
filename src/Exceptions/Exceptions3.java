package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args) {

        //Checked Exception (Compile time exception)

        File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception");
        }

        //Unchecked exception (Runtime exception)

        int a = 1 / 0;

        String name = null;
        name.length();

        int[] array = new int[2];
        System.out.println(array[2]);
    }
}
