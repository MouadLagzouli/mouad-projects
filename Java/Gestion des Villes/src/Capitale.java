public class Capitale extends Ville {
    private String pays;

    public Capitale(String nom, String pays) {
        super(nom);
        this.pays = pays;
    }

    public Capitale(String nom, String pays, int nbHabitants) {
        super(nom, nbHabitants);
        this.pays = pays;
    }

    @Override
    public void description() {
        System.out.println("* Capitale : " + getNom() +
                ", pays : " + pays +
                ", habitants : " + getNbHabitants() + " *");
    }

    @Override
    public String toString() {
        return "* Capitale : " + getNom() +
                ", pays : " + pays +
                ", habitants : " + getNbHabitants() + " *";
    }

    @Override
    public char categorie() {
        return 'C';
    }
}
