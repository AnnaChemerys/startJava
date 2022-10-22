package com.hw;

public class StringBuilderClass {
    public static void main(String[] args) {
        String x = "Hello";
        x.toUpperCase();
        System.out.println(x);

        x = x.toUpperCase();
        System.out.println(x);

        String string1 = "Hi";
        String string2 = " my";
        String string3 = " friend";
        String stringAll = string1 + string2 + string3;
        System.out.println(stringAll);

        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println(stringBuilder.toString());
        stringBuilder.append(" my");
        stringBuilder.append(" friend").append(" from StringBuilder!");
        System.out.println(stringBuilder);
    }
}
