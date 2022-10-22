package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //////////////////Java 5 //////////////////
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(ourAnimal);

        String animal = (String) animals.get(1);
        System.out.println(animal);

        //////////////// With the advent Generics /////////////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("Cat");
        animals2.add("Dog");
        animals2.add("Frog");

        String animal2 = animals2.get(1);
        System.out.println(animal2);

        ///////////////////Java 7 ////////////////
        List<String> animals3 = new ArrayList<>();
    }
}
