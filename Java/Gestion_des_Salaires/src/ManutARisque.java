public class ManutARisque extends Manutentionnaire implements ARisque {

    public ManutARisque(String prenom, String nom, int age, String dateEntree, int nbHeuresMensuelles) {
        super(prenom, nom, age, dateEntree, nbHeuresMensuelles);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + PRIME_RISQUE;
    }
}
