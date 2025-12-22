public class TechnARisque extends Technicien implements ARisque {

    public TechnARisque(String prenom, String nom, int age, String dateEntree, int nbUnitesMensuelles) {
        super(prenom, nom, age, dateEntree, nbUnitesMensuelles);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + PRIME_RISQUE;
    }
}
