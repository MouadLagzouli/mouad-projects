package figures_geometriques;

public class TestFigure {

    public static void main(String[] args) {

        Cercle c = new Cercle(0, 0, 5);
        Rectangle r = new Rectangle(2, 3, 4, 6);
        RectangleColore rc = new RectangleColore(1, 1, 3, 5, 255);

        System.out.println("Affichage des figures :");
        c.affiche();
        r.affiche();
        rc.affiche();

        System.out.println("\nTest de la méthode estInterieur :");
        System.out.println("Point (2,3) dans le cercle ? " + c.estInterieur(2, 3));
        System.out.println("Point (6,6) dans le cercle ? " + c.estInterieur(6, 6));

        System.out.println("\nTest du polymorphisme :");
        Figure[] tab = {c, r, rc};
        for (Figure f : tab) {
            f.affiche();
        }
    }
}
