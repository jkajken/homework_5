package org.example;

public class Hero {
    private int heroHealth;
    private int heroDamage;
    private String superPower;

    public Hero(int heroHealth, int heroDamage, String superPower) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.superPower = superPower;
    }

    public Hero(int heroHealth, int heroDamage) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String getSuperPower() {
        return superPower;
    }
}
