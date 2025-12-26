public class Ramette extends Article {

    public int grammage;
    public String couleur;

    public Ramette(String marque, int grammage) {
        super(marque);
        this.grammage = grammage;
        this.couleur = "blanc";
    }

    public Ramette(String marque, int grammage, String couleur, double prixUnitaire) {
        super(marque, prixUnitaire);
        this.grammage = grammage;
        this.couleur = couleur;
    }

    public int getGrammage() {
        return grammage;
    }

    public String getCouleur() {
        return couleur;
    }

    @Override
    public String calculeReference() {
        return marque + ":ramette:" + grammage + ":" + couleur;
    }

    @Override
    public String toString() {
        return "Ramette [marque=" + marque + ", grammage=" + grammage +
               ", couleur=" + couleur + ", prix=" + prixUnitaire + "]";
    }
}
