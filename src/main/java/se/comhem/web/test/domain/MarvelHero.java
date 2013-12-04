package se.comhem.web.test.domain;

public class MarvelHero implements Hero {

    private String name;
    private String weakness;
    private Gender gender;

    public MarvelHero() { }

    public MarvelHero(String name, String weakness, Gender gender) {
        this.name = name;
        this.weakness = weakness;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getWeakness() {
        return weakness;
    }

    public Gender getGender() {
        return gender;
    }
}
