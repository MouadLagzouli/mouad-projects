package figures_geometriques;

public class RectangleColore extends Rectangle {
    private int couleur;

    public RectangleColore(double x, double y, double longueur, double largeur, int couleur) {
        super(x, y, longueur, largeur);
        this.couleur = couleur;
    }

    @Override
    public void affiche() {
        System.out.println("Rectangle coloré : centre=(" + x + ", " + y + "), longueur=" +
                longueur + ", largeur=" + largeur + ", couleur=" + couleur +
                ", surface=" + surface());
    }
}
