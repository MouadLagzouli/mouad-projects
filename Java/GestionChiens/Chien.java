public class Chien extends Animal {
    private RaceChien race;

    public Chien(String nom, RaceChien race) {
        super(nom);
        this.race = race;
    }

    public RaceChien getRace() {
        return race;
    }

    public void setRace(RaceChien race) {
        this.race = race;
    }

    @Override
    public String afficher() {
        return "Chien: " + nom + " | Race: " + race;
    }
}
