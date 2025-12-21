public class Representant extends Commercial {

    public Representant(String prenom, String nom, int age, String dateEntree, double chiffreAffairesMensuel) {
        super(prenom, nom, age, dateEntree, chiffreAffairesMensuel);
    }

    @Override
    public double calculerSalaire() {
        return 0.20 * chiffreAffairesMensuel + 800.0;
    }

    @Override
    public String getNom() {
        return "Le représentant " + prenom + " " + nom;
    }
}
