public class Patelin extends Ville {

    public Patelin(String nom) {
        super(nom);
    }

    public Patelin(String nom, int nbHabitants) {
        super(nom, Math.min(nbHabitants, 1000));
    }

    @Override
    public void setNbHabitants(int nbHabitants) {
        super.setNbHabitants(Math.min(nbHabitants, 1000));
    }

    @Override
    public void description() {
        System.out.println("||| Patelin : " + getNom() +
                ", habitants : " + getNbHabitants() + " |||");
    }

    @Override
    public String toString() {
        return "||| Patelin : " + getNom() +
                ", habitants : " + getNbHabitants() + " |||";
    }
}
