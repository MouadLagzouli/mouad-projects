import java.util.Scanner;

public class Factorielle {

    public static void main(String[] args) {

        int n;
        long fact = 1; 

        Scanner clavier = new Scanner(System.in);

        System.out.print("Donner une valeur : ");
        n = clavier.nextInt();

        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        System.out.println("La factorielle de " + n + " est : " + fact);

        clavier.close();
    }
}
