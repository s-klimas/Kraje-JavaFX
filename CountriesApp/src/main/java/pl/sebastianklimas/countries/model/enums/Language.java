package pl.sebastianklimas.countries.model.enums;

public enum Language {
    POLISH(0, "polski"),
    ENGLISH(1, "english");

    private int value;
    private String language;

    Language(int value, String language) {
        this.value = value;
        this.language = language;
    }

    public int getValue() {
        return value;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return value + " - " + language;
    }
}
