public class Vendeur extends Commercial {

    public Vendeur(String prenom, String nom, int age, String dateEntree, double chiffreAffairesMensuel) {
        super(prenom, nom, age, dateEntree, chiffreAffairesMensuel);
    }

    @Override
    public double calculerSalaire() {
        return 0.20 * chiffreAffairesMensuel + 400.0;
    }

    @Override
    public String getNom() {
        return "Le vendeur " + prenom + " " + nom;
    }
}
