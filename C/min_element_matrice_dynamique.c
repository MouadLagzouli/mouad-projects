#include <stdio.h>
#include <stdlib.h>

int main() {
    float *T, min;
    int L, C;
    int i, j;
    int posL = 0, posC = 0;

    // Lecture des dimensions
    do {
        printf("Entrez le nombre de lignes : ");
        scanf("%d", &L);
        printf("Entrez le nombre de colonnes : ");
        scanf("%d", &C);
    } while (L < 2 || C < 2);

    // Allocation dynamique
    T = (float *)malloc(L * C * sizeof(float));
    if (T == NULL) {
        printf("Pas assez d'espace memoire.\n");
        exit(-1);
    }

    // Lecture du tableau
    printf("\nLecture du tableau T :\n");
    for (i = 0; i < L; i++) {
        for (j = 0; j < C; j++) {
            printf("T[%d][%d] = ", i, j);
            scanf("%f", T + i * C + j);   // i*C + j
        }
    }

    // Affichage du tableau
    printf("\nAffichage du tableau :\n");
    for (i = 0; i < L; i++) {
        for (j = 0; j < C; j++) {
            printf("%8.2f ", *(T + i * C + j));
        }
        printf("\n");
    }

    // Recherche du minimum
    min = *T;           // premier élément
    posL = 0;
    posC = 0;

    for (i = 0; i < L; i++) {
        for (j = 0; j < C; j++) {
            if (*(T + i * C + j) < min) {
                min = *(T + i * C + j);
                posL = i;
                posC = j;
            }
        }
    }

    printf("\nLa plus petite valeur du tableau est %f\n", min);
    printf("Sa position est (%d, %d)\n", posL, posC);

    free(T);
    T = NULL;

    return 0;
}
