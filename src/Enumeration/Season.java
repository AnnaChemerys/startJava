package Enumeration;

public enum Season {
    SPRING("весна"), SUMMER("літо"), AUTUMN("осінь"), WINTER("зима");

    private String translation;

    Season() {

    }

    Season(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}
