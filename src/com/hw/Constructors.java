package com.hw;

public class Constructors {
    public static void main(String[] args) {
        NewHuman newHuman = new NewHuman();
        NewHuman.description = "Nice";
        NewHuman.getDescription();
        NewHuman h1 = new NewHuman("Bob", 40);
        NewHuman h2 = new NewHuman("Tom", 30);
        h1.getAllFields();
        h2.getAllFields();
        NewHuman.description = "Bad";
        h1.getAllFields();
        h2.getAllFields();

        System.out.println(Math.pow(2, 4));
        System.out.println(Math.PI);
    }
}

class NewHuman {
    private String name;
    private int age;

    public static String description;
    private static int countOfPeople;

    public NewHuman() {
        System.out.println("Hello from first constructor!");
        this.name = "Default name";
        this.age = 0;
        countOfPeople++;
    }

    public NewHuman(String name) {
        System.out.println("Hello from second constructor!");
        this.name = name;
        countOfPeople++;
    }

    public NewHuman(String name, int age) {
        System.out.println("Hello from third constructor!");
        this.name = name;
        this.age = age;
        countOfPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void getDescription() {
        System.out.println(description);
    }

    public void getAllFields() {
        System.out.println(name + ", " + age + ", " + description + ", count of people " + countOfPeople);
    }
}
