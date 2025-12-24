package figures_geometriques;

public class Cercle extends Figure {
    private double rayon;

    public Cercle(double x, double y, double rayon) {
        super(x, y);
        this.rayon = rayon;
    }

    public boolean estInterieur(double x, double y) {
        return ((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y)) <= (rayon * rayon);
    }

    @Override
    public double surface() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public void affiche() {
        System.out.println("Cercle : centre=(" + x + ", " + y + "), rayon=" + rayon +
                ", surface=" + surface());
    }
}
