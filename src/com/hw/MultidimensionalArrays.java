package com.hw;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3};
        System.out.println(numbers[1]);

        int [][] matrice = {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};

        System.out.println(matrice[2][1]);
        System.out.println(matrice[1][0]);
        System.out.println("");

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println("");
        }

        int [] newNumbers = new int[5];

        System.out.println("");
        String[][] strings = new String[2][3];
        strings[0][1] = "Java";
        System.out.println(strings[0][1]);
    }
}
