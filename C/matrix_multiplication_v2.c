#include <stdio.h>

int main() {
    int A[50][50], B[50][50], C[50][50];
    int N, M, P;
    int i, j, k;

    // Lecture des dimensions
    do {
        printf("Donnez le nombre de lignes de la matrice A (N) : ");
        scanf("%d", &N);
        printf("Donnez le nombre de colonnes de la matrice A (M) : ");
        scanf("%d", &M);
        printf("Donnez le nombre de colonnes de la matrice B (P) : ");
        scanf("%d", &P);
    } while (N < 2 || N > 50 || M < 2 || M > 50 || P < 2 || P > 50);

    // Saisie de la matrice A
    printf("\nSaisie de la matrice A (%d x %d):\n", N, M);
    for (i = 0; i < N; i++) {
        for (j = 0; j < M; j++) {
            printf("A[%d][%d] = ", i, j);
            scanf("%d", &A[i][j]);
        }
    }

    // Saisie de la matrice B
    printf("\nSaisie de la matrice B (%d x %d):\n", M, P);
    for (i = 0; i < M; i++) {
        for (j = 0; j < P; j++) {
            printf("B[%d][%d] = ", i, j);
            scanf("%d", &B[i][j]);
        }
    }

    // Initialisation de la matrice C
    for (i = 0; i < N; i++) {
        for (j = 0; j < P; j++) {
            C[i][j] = 0;
        }
    }

    // Calcul du produit matriciel
    for (i = 0; i < N; i++) {
        for (j = 0; j < P; j++) {
            for (k = 0; k < M; k++) {
                C[i][j] += A[i][k] * B[k][j];
            }
        }
    }

    // Affichage de la matrice résultat
    printf("\nMatrice C = A x B (%d x %d):\n", N, P);
    for (i = 0; i < N; i++) {
        for (j = 0; j < P; j++) {
            printf("%6d ", C[i][j]);
        }
        printf("\n");
    }

    return 0;
}
