public abstract class Article {

    public String marque;
    public double prixUnitaire;

    public Article(String marque) {
        this.marque = marque;
        this.prixUnitaire = 0;
    }

    public Article(String marque, double prixUnitaire) {
        this.marque = marque;
        this.prixUnitaire = prixUnitaire;
    }

    public String getMarque() {
        return marque;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public abstract String calculeReference();

    @Override
    public String toString() {
        return "Article [marque=" + marque + ", prix=" + prixUnitaire + "]";
    }
}
