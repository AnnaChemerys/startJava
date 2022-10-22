package com.hw;

import Package1.Person;

public class AccessModifiers extends Person {
    public static void main(String[] args) {
        /* public, private, default (available in this package), protected (available in this package,
         available to all subclasses, even if they are outside the package) */
        Person person1 = new Person();
        System.out.println(Person.CONSTANT);
    }
}
