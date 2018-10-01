package fi.tamk.tiko.doki;

public abstract class AlcoholicDrink {
    protected String name;
    protected float volume;
    protected float alcoholByVolume;

    public AlcoholicDrink(String name, float volume, float alcoholByVolume) {
        this.name = name;
        this.volume = volume;
        this.alcoholByVolume = alcoholByVolume;
    }

    public String getName() {
        return name;
    }

    public float getVolume() {
        return volume;
    }

    public float getAlcoholByVolume() {
        return alcoholByVolume;
    }
}
