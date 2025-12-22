public class Manutentionnaire extends Employe {
    public int nbHeuresMensuelles;

    public Manutentionnaire(String prenom, String nom, int age, String dateEntree, int nbHeuresMensuelles) {
        super(prenom, nom, age, dateEntree);
        this.nbHeuresMensuelles = nbHeuresMensuelles;
    }

    @Override
    public double calculerSalaire() {
        return nbHeuresMensuelles * 65.0;
    }

    @Override
    public String getNom() {
        return "Le manut. " + prenom + " " + nom;
    }
}
