package UpcastingAndDowncasting;

public class Test {
    public static void main(String[] args) {

        //Upcasting
        Dog dog = new Dog();
        Animal animal = dog;

        //Downcasting
        Dog dog2 = (Dog) animal;
        dog2.bark();

        Animal animal1 = new Animal();
        Dog dog1 = (Dog) animal1;
        dog1.bark(); // ClassCastException
    }
}
