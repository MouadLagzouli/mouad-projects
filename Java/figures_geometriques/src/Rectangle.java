package figures_geometriques;

public class Rectangle extends Figure {
    protected double longueur;
    protected double largeur;

    public Rectangle(double x, double y, double longueur, double largeur) {
        super(x, y);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double surface() {
        return longueur * largeur;
    }

    @Override
    public void affiche() {
        System.out.println("Rectangle : centre=(" + x + ", " + y + "), longueur=" +
                longueur + ", largeur=" + largeur + ", surface=" + surface());
    }
}
