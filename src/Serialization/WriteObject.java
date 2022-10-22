package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {

        Person[] people = {new Person(1, "Sheldon", "Cooper"),
                new Person(2, "Leonard", "Hofstadter"),
                new Person(3, "Stephen", "Hawking")};

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("people.bin"))){

            objectOutputStream.writeObject(people);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
