import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre entier : ");
        int n = sc.nextInt();

        Nombre nombre = new Nombre(n);

        if (nombre.estPair()) {
            System.out.println("Le nombre " + nombre.getValeur() + " est pair.");
        } else {
            System.out.println("Le nombre " + nombre.getValeur() + " est impair.");
        }

        sc.close();
    }
}
