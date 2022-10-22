package Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog(3));
        listOfDogs.add(new Dog(4));

        test(listOfAnimals);
        test(listOfDogs);
    }

    private static void test(List<? extends Animal> list){
        for (Animal animal: list) {
            System.out.println(animal);
        }
    }
}
