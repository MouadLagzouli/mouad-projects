public class OperationMatrices {

    public static Matrice multiplier(Matrice A, Matrice B) {

        int N = A.getLignes();
        int M = A.getColonnes();
        int P = B.getColonnes();

        Matrice C = new Matrice(N, P);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < P; j++) {
                int somme = 0;
                for (int k = 0; k < M; k++) {
                    somme += A.get(i, k) * B.get(k, j);
                }
                C.data[i][j] = somme; 
            }
        }
        return C;
    }
}
