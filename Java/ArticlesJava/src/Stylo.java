public class Stylo extends Article {

    public String couleur;

    public Stylo(String marque, String couleur) {
        super(marque);
        this.couleur = couleur;
    }

    public Stylo(String marque, String couleur, double prixUnitaire) {
        super(marque, prixUnitaire);
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    @Override
    public String calculeReference() {
        return marque + ":stylo:" + couleur;
    }

    @Override
    public String toString() {
        return "Stylo [marque=" + marque + ", couleur=" + couleur + ", prix=" + prixUnitaire + "]";
    }
}
