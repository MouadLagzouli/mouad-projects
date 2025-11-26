public class Voiture extends Vehicule {

    // Attributs propres à Voiture
    private double cylindree;
    private int nbPortes;
    private double puissance;
    private int kilometrage;

    // Constructeur
    public Voiture(String marque, int dateAchat, double prixAchat,
                   double cylindree, int nbPortes, double puissance, int kilometrage) {

        super(marque, dateAchat, prixAchat); // Appel au constructeur parent

        this.cylindree = cylindree;
        this.nbPortes = nbPortes;
        this.puissance = puissance;
        this.kilometrage = kilometrage;
    }

    // Redéfinition de calculePrix()
    @Override
    public void calculePrix(int anneeActuelle) {
        int age = anneeActuelle - dateAchat;
        prixCourant = prixAchat;

        // Dépréciation normale
        prixCourant -= prixAchat * 0.02 * age;

        // Dépréciation selon kilométrage
        prixCourant -= prixAchat * 0.05 * (kilometrage / 10000.0);

        // Adaptation selon la marque
        if (marque.equalsIgnoreCase("Renault") || marque.equalsIgnoreCase("Fiat")) {
            prixCourant -= prixAchat * 0.10;
        }
        if (marque.equalsIgnoreCase("Ferrari") || marque.equalsIgnoreCase("Porsche")) {
            prixCourant += prixAchat * 0.20;
        }

        // Prix minimum
        if (prixCourant < 0)
            prixCourant = 0;
    }

    // Redéfinition de affiche()
    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Cylindrée: " + cylindree +
                           ", Portes: " + nbPortes +
                           ", Puissance: " + puissance +
                           ", Km: " + kilometrage);
        System.out.println("----------------------------------");
    }
}
