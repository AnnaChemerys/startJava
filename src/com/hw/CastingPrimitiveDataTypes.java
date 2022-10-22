package com.hw;

public class CastingPrimitiveDataTypes {
    public static void main(String[] args) {
        float f = 123.123F;
        long l = 5212121L;
        int x = 123;
        int a = (int)l;

        double d = 123.5;
        int b = (int) d;

        byte b1 = (byte)128;

        System.out.println(a);
        System.out.println(b);
        System.out.println(Math.round(d));
        System.out.println(b1);
    }
}
