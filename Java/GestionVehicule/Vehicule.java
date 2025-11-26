public class Vehicule {

    // Attributs
    protected String marque;
    protected int dateAchat;
    protected double prixAchat;
    protected double prixCourant;

    // Constructeur
    public Vehicule(String marque, int dateAchat, double prixAchat) {
        this.marque = marque;
        this.dateAchat = dateAchat;
        this.prixAchat = prixAchat;
    }

    // Méthode pour afficher les informations du véhicule
    public void affiche() {
        System.out.println(
            "Marque: " + marque +
            ", Date d'achat: " + dateAchat +
            ", Prix d'achat: " + prixAchat +
            ", Prix courant: " + prixCourant
        );
    }

    // Méthode pour calculer le prix actuel du véhicule
    public void calculePrix(int anneeActuelle) {
        int age = anneeActuelle - dateAchat;
        prixCourant = prixAchat - (prixAchat * 0.01 * age);

        // Éviter un prix négatif
        if (prixCourant < 0) prixCourant = 0;
    }
}
