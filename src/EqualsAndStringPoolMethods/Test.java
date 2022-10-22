package EqualsAndStringPoolMethods;

public class Test {
    public static void main(String[] args) {

        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);

        System.out.println(animal1 == animal2);
        System.out.println(animal1.equals(animal2));

        String string1 = "Hello";
        String string2 = "Hello";

        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2));

        String a = "hello";
        String b = "hello123".substring(0, 5);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);
    }
}
