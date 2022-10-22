package Enumeration;

public class Test {

    public static void main(String[] args) {

        Animal animal = Animal.CAT;

        switch (animal) {
            case CAT -> System.out.println("It's a cat");
            case DOG -> System.out.println("It's a dog");
            case FROG -> System.out.println("It's a frog");
            default -> System.out.println("It's not an animal");
        }

        System.out.println(animal);
        System.out.println(animal.getSound());
        System.out.println(animal.name());
        System.out.println(animal.ordinal());

        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.name());
        System.out.println(frog.getSound());

        // Object -> Enum -> Season

        Season season = Season.SUMMER;

        System.out.println(season instanceof Enum);
        System.out.println(season instanceof Season);
        System.out.println(season.getClass());

        switch (season) {
            case SUMMER -> System.out.println("It's warm outside");
            case WINTER -> System.out.println("It's cold outside");
        }

        System.out.println(season);
        System.out.println(season.getTranslation());
    }
}
