package com.hw;

public class Break_Continue {
    public static void main(String[] args) {
        /*int i = 0;
        while (true) {
            if(i == 15) {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("We are out of the loop");*/

        for (int i = 0; i <= 15 ; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("It's an odd number " + i);
        }
    }
}
