import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez les coefficients a, b et c :");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        Equation eq = new Equation(a, b, c);
        eq.afficherSolutions();

        sc.close();
    }
}
