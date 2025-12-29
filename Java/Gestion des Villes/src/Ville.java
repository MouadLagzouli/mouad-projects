public class Ville {
    private String nom;
    private int nbHabitants;

    public Ville(String nom) {
        if (nom == null || nom.isEmpty()) {
            System.err.println("Erreur : le nom de la ville est obligatoire.");
            System.exit(1);
        }
        this.nom = nom;
        this.nbHabitants = 0;
    }

    public Ville(String nom, int nbHabitants) {
        this(nom);
        this.nbHabitants = nbHabitants;
    }

    public String getNom() {
        return nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    public void description() {
        System.out.println("Ville : " + nom + ", habitants : " + nbHabitants);
    }

    @Override
    public String toString() {
        return "Ville : " + nom + ", habitants : " + nbHabitants;
    }

    public char categorie() {
        if (nbHabitants == 0) return '?';
        if (nbHabitants <= 500_000) return 'A';
        return 'B';
    }
}
