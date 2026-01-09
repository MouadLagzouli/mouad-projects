import java.util.Scanner;

public class AnalyseTableau {

    // Méthode qui calcule le nombre de pairs, impairs et zéros
    public static void fct3(int[] t, int n, int[] resultats) {
        int np = 0, nimp = 0, nbz = 0;

        for (int i = 0; i < n; i++) {
            if (t[i] == 0)
                nbz++;
            else if (t[i] % 2 == 0)
                np++;
            else
                nimp++;
        }

        // Stockage des résultats
        resultats[0] = nbz;
        resultats[1] = np;
        resultats[2] = nimp;
    }

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrer la dimension du tableau : ");
        int N = clavier.nextInt();

        int[] T = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Entrer T[" + i + "] : ");
            T[i] = clavier.nextInt();
        }

        int[] resultats = new int[3]; // [0]=zéros, [1]=pairs, [2]=impairs

        fct3(T, N, resultats);

        System.out.println("\n--- Résultats ---");
        System.out.println("Nombre de zéros : " + resultats[0]);
        System.out.println("Nombre d’éléments pairs : " + resultats[1]);
        System.out.println("Nombre d’éléments impairs : " + resultats[2]);

        clavier.close();
    }
}
