public class GestionVehi {

    private static final int ANNEE_ACTUELLE = 2012;

    public static void main(String[] args) {

        Voiture[] garage = new Voiture[3];  // Voiture avec V majuscule
        Avion[] hangar = new Avion[2];

        garage[0] = new Voiture("Peugeot", 2005, 147325.79, 2.5, 5, 180.0, 12000);
        garage[1] = new Voiture("Porsche", 1999, 250000.00, 6.5, 2, 280.0, 81320);
        garage[2] = new Voiture("Fiat", 2001, 7327.30, 1.6, 3, 65.0, 3000);

        hangar[0] = new Avion("Cessna", 1982, 1230673.90, "HELICES", 250);
        hangar[1] = new Avion("Nain Connu", 1993, 4321098.00, "REACTION", 1300);

        for (Voiture v : garage) {
            v.calculePrix(ANNEE_ACTUELLE);
            v.affiche();
        }

        for (Avion a : hangar) {
            a.calculePrix(ANNEE_ACTUELLE);
            a.affiche();
        }
    }
}
