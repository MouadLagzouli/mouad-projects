public class Avion extends Vehicule {

    private String typeMoteur; // "HELICES" ou "REACTION"
    private int heuresVol;

    public Avion(String marque, int dateAchat, double prixAchat,
                 String typeMoteur, int heuresVol) {
        super(marque, dateAchat, prixAchat);
        this.typeMoteur = typeMoteur;
        this.heuresVol = heuresVol;
    }

    @Override
    public void calculePrix(int anneeActuelle) {
        prixCourant = prixAchat;

        if ("HELICES".equalsIgnoreCase(typeMoteur)) {

            // -10% par tranche de 100 heures
            int tranches = (int) Math.round(heuresVol / 100.0);
            prixCourant -= prixAchat * 0.10 * tranches;

        } else {

            // -10% par tranche de 1000 heures
            int tranches = (int) Math.round(heuresVol / 1000.0);
            prixCourant -= prixAchat * 0.10 * tranches;
        }

        if (prixCourant < 0)
            prixCourant = 0;
    }

    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Type moteur : " + typeMoteur +
                           ", Heures de vol : " + heuresVol);
        System.out.println("----------------------------------");
    }
}
