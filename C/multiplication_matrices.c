#include <stdio.h>
#include <stdlib.h>

int main() {
    int *A, *B, *C;
    int N, M, P;
    int I, J, K;

    do {
        printf("=== Multiplication de Matrices ===\n");
        printf("Nombre de lignes de A : ");
        scanf("%d", &N);

        printf("Nombre de colonnes de A (et lignes de B) : ");
        scanf("%d", &M);

        printf("Nombre de colonnes de B : ");
        scanf("%d", &P);

        printf("\n");
    } while (N < 2 || M < 2 || P < 2);

    // Allocation dynamique
    A = (int *)malloc(N * M * sizeof(int));
    B = (int *)malloc(M * P * sizeof(int));
    C = (int *)malloc(N * P * sizeof(int));

    if (A == NULL || B == NULL || C == NULL) {
        printf("Erreur : pas assez d'espace memoire !\n");
        exit(-1);
    }

    printf("Lecture Matrice A (%d x %d) :\n", N, M);
    for (I = 0; I < N; I++)
        for (J = 0; J < M; J++) {
            printf("A[%d][%d] = ", I, J);
            scanf("%d", A + I * M + J);
        }

    printf("\nLecture Matrice B (%d x %d) :\n", M, P);
    for (I = 0; I < M; I++)
        for (J = 0; J < P; J++) {
            printf("B[%d][%d] = ", I, J);
            scanf("%d", B + I * P + J);
        }

    printf("\n=== Matrice A ===\n");
    for (I = 0; I < N; I++) {
        for (J = 0; J < M; J++)
            printf("%5d ", *(A + I * M + J));
        printf("\n");
    }

    printf("\n=== Matrice B ===\n");
    for (I = 0; I < M; I++) {
        for (J = 0; J < P; J++)
            printf("%5d ", *(B + I * P + J));
        printf("\n");
    }

    for (I = 0; I < N; I++) {
        for (J = 0; J < P; J++) {
            *(C + I * P + J) = 0;
            for (K = 0; K < M; K++) {
                *(C + I * P + J) += *(A + I * M + K) * *(B + K * P + J);
            }
        }
    }

    printf("\n=== Matrice C = A × B ===\n");
    for (I = 0; I < N; I++) {
        for (J = 0; J < P; J++)
            printf("%5d ", *(C + I * P + J));
        printf("\n");
    }

    free(A);
    free(B);
    free(C);

    return 0;
}
