package com.hw;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Jane");
        person1.setAge(31);
        person1.speak();
        person1.sayHello();
        int year1 = person1.calculateYearsToRetirement();
        System.out.println(person1.getName() + " is " + year1 + " years away from retirement.");

        System.out.println("");

        Person person2 = new Person();
        String s1 = "Jack";
        person2.setName(s1);
        person2.setAge(21);
        person2.sayHello();
        person2.speak();
        int year2 = person2.calculateYearsToRetirement();
        System.out.println(person2.getName() + " is " + year2 + " years away from retirement.");

    }
}

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("You entered an empty name.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age must be greater than zero.");
        }
        this.age = age;
    }

    int calculateYearsToRetirement() {
        return 65 - age;
    }

    void speak() {
        System.out.println("My name is " + name + ". I'm " + age);
    }

    void sayHello() {
        System.out.println("Hello!");
    }
}
