package fi.tamk.tiko.doki;

public enum Gender {
    Male, Female, NonBinary;

    public boolean oppositeSex(Gender g) {
        return (this == Male && g == Female) || (this == Female && g == Male);
    }
}
