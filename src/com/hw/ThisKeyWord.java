package com.hw;

public class ThisKeyWord {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Ann");
        human1.setAge(25);
        human1.getInfo();

        Human human2 = new Human();
        human1.setName("Tom");
        human1.setAge(37);
        human1.getInfo();
    }
}

class Human {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getInfo() {
        System.out.println(name + ", " + age);
    }
}
