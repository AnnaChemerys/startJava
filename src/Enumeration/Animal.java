package Enumeration;

public enum Animal {
    DOG("bark"), CAT("purr"), FROG("croak");

    private String sound;

    Animal(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
