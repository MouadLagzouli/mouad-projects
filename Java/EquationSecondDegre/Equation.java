public class Equation {

    private double a;
    private double b;
    private double c;

    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculerDelta() {
        return b * b - 4 * a * c;
    }

    public void afficherSolutions() {
        double delta = calculerDelta();

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("Deux solutions reelles distinctes :");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Une solution reelle double : x = " + x);
        }
        else {
            System.out.println("Aucune solution reelle.");
        }
    }
}
