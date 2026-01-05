import java.util.Scanner;

public class SerieHarmonique {

    public static double serieHarmonique(int N) {
        double somme = 0.0;

        for (int i = 1; i <= N; i++) {
            somme += 1.0 / i;
        }

        return somme;
    }

    public static void main(String[] args) {

        int N;
        double somme;

        Scanner clavier = new Scanner(System.in);

        do {
            System.out.print("Entrez la valeur de N : ");
            N = clavier.nextInt();
        } while (N <= 0);

        somme = serieHarmonique(N);

        System.out.println("La somme de la série harmonique est : " + somme);

        clavier.close();
    }
}
