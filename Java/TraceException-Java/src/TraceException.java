public class TraceException {
    private double x;

    public TraceException(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void m1(double y) throws E1, E2 {
        System.out.println("Début de m1");
        if (y == 0)
            throw new E1("parametre de m1 null");
        if (x * y < 0)
            throw new E2("parametre de signe opposé à l'attribut");
        x = x / y;
        System.out.println("Fin de m1");
    }

    public void m2(double y) throws E1 {
        System.out.println("Début de m2");
        try {
            System.out.println("Dans m2 avant appel de m1");
            m1(y);
            System.out.println("Dans m2 apres appel de m1");
        } catch (E2 excpt) {
            System.out.println(excpt.getMessage());
        }
        System.out.println("Fin de m2");
    }

    public static void main(String[] args) throws E1 {
        System.out.println("Debut du main");
        TraceException te = new TraceException(Double.parseDouble(args[0]));
        te.m2(Double.parseDouble(args[1]));
        System.out.println("x = " + te.getX());
        System.out.println("Fin du main");
    }
}
