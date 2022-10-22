package NestedClasses;

public class Electrocar {

    private int id;

    // nested non-static class
    private class Engine {
        public void startEngine() {
            System.out.println("Engine " + id + " is starting...");
        }
    }

    // nested static class
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging...");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Engine engine = new Engine();
        engine.startEngine();

        final int x = 1;

        class SomeClass {
            public void someMethod() {
                System.out.println(x);
                System.out.println(id);
            }
        }

        SomeClass someObject = new SomeClass();
        test(someObject);

        System.out.println("Electrocar " + id + " is starting...");
    }

    private void test(Object object) {

    }
}
