import java.util.ArrayList;

public class Chenil {
    private ArrayList<Chien> chiens;

    public Chenil() {
        chiens = new ArrayList<>();
    }

    public void ajouterChien(Chien chien) {
        if (chien == null) {
            throw new IllegalArgumentException("Le chien ne peut pas être null.");
        }
        chiens.add(chien);
    }

    public boolean supprimerParNom(String nom) {
        Validation.verifierNom(nom);

        for (int i = 0; i < chiens.size(); i++) {
            if (chiens.get(i).getNom().equalsIgnoreCase(nom.trim())) {
                chiens.remove(i);
                return true;
            }
        }
        return false;
    }

    public Chien chercherParNom(String nom) {
        Validation.verifierNom(nom);

        for (Chien c : chiens) {
            if (c.getNom().equalsIgnoreCase(nom.trim())) {
                return c;
            }
        }
        return null;
    }

    public ArrayList<Chien> chercherParRace(RaceChien race) {
        ArrayList<Chien> resultat = new ArrayList<>();
        if (race == null) return resultat;

        for (Chien c : chiens) {
            if (c.getRace() == race) {
                resultat.add(c);
            }
        }
        return resultat;
    }

    public ArrayList<Chien> getChiens() {
        return chiens;
    }

    public void afficherTous() {
        if (chiens.isEmpty()) {
            System.out.println("Aucun chien dans le chenil.");
            return;
        }
        for (int i = 0; i < chiens.size(); i++) {
            System.out.println((i + 1) + ") " + chiens.get(i).afficher());
        }
    }

    public int taille() {
        return chiens.size();
    }
}
