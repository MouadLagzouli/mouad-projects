import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N, M, P;

        do {
            System.out.println("=== Multiplication de Matrices ===");
            System.out.print("Nombre de lignes de A : ");
            N = sc.nextInt();

            System.out.print("Nombre de colonnes de A (et lignes de B) : ");
            M = sc.nextInt();

            System.out.print("Nombre de colonnes de B : ");
            P = sc.nextInt();

            System.out.println();
        } while (N < 2 || M < 2 || P < 2);

        Matrice A = new Matrice(N, M);
        Matrice B = new Matrice(M, P);

        A.lire(sc, "A");
        B.lire(sc, "B");

        A.afficher("Matrice A");
        B.afficher("Matrice B");

        Matrice C = OperationMatrices.multiplier(A, B);
        C.afficher("Matrice C = A x B");

        sc.close();
    }
}
