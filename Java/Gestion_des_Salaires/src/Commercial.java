public abstract class Commercial extends Employe {
    public double chiffreAffairesMensuel;

    public Commercial(String prenom, String nom, int age, String dateEntree, double chiffreAffairesMensuel) {
        super(prenom, nom, age, dateEntree);
        this.chiffreAffairesMensuel = chiffreAffairesMensuel;
    }
}
