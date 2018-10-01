package fi.tamk.tiko.doki;

public interface Character {

    void talkWith(Character other);

    void fight(Character other);

    int getHealthPoints();

    float getAlcoholTolerance();

    float getIntoxicationLevel();


}
