package zad02;

public class User {
    private String name;
    Translation translation;

    public User(String name, Translation translation) {
        this.name = name;
        this.translation = translation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Translation getTranslation() {
        return translation;
    }

    public void setTranslation(Translation translation) {
        this.translation = translation;
    }
}
