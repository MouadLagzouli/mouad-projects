package figures_geometriques;

public abstract class Figure {
    protected double x;
    protected double y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setCentre(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract void affiche();
    public abstract double surface();
}
