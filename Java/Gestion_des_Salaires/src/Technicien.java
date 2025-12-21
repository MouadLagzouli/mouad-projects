public class Technicien extends Employe {
    public int nbUnitesMensuelles;

    public Technicien(String prenom, String nom, int age, String dateEntree, int nbUnitesMensuelles) {
        super(prenom, nom, age, dateEntree);
        this.nbUnitesMensuelles = nbUnitesMensuelles;
    }

    @Override
    public double calculerSalaire() {
        return nbUnitesMensuelles * 5.0;
    }

    @Override
    public String getNom() {
        return "Le technicien " + prenom + " " + nom;
    }
}
