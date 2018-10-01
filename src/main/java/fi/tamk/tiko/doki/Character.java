package fi.tamk.tiko.doki;

public abstract class Character {

    private String name;

    private int healthPoints;

    private int experiencePoints;

    private float alcoholTolerance;

    private float intoxicationLevel;

    public Character(String name) {
        this.healthPoints = 1;
        this.alcoholTolerance = 0;
        this.intoxicationLevel = 0;
    }

    public Character(String name, int healthPoints, float alcoholTolerance, float intoxicationLevel) {
        this.healthPoints = healthPoints;
        this.alcoholTolerance = alcoholTolerance;
        this.intoxicationLevel = intoxicationLevel;
    }

    public abstract void talkWith(Character other);

    public abstract void fight(Character other);

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public float getAlcoholTolerance() {
        return alcoholTolerance;
    }

    public void setAlcoholTolerance(float alcoholTolerance) {
        this.alcoholTolerance = alcoholTolerance;
    }

    public float getIntoxicationLevel() {
        return intoxicationLevel;
    }

    public void setIntoxicationLevel(float intoxicationLevel) {
        this.intoxicationLevel = intoxicationLevel;
    }
}
