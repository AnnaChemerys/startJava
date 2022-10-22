package Polymorphism;

public class Test {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        Animal animal = new Dog();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(animal1);
        test(animal);
        test(dog);
        test(cat);

    }

    public static void test(Animal animal) {
        animal.eat();
    }
}
