package fi.tamk.tiko.doki;

public class Character {

    protected String name;

    protected int healthPoints;

    protected int experiencePoints;

    protected float alcoholTolerance;

    protected float intoxicationLevel;

    public Event getCurrentEvent() {
        return currentEvent;
    }

    public void setCurrentEvent(Event currentEvent) {
        this.currentEvent = currentEvent;
        currentEvent.render();
    }

    Event currentEvent;

    public Character() {

    }

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
