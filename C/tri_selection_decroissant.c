#include <stdio.h>
#include <stdlib.h>

void permuter(int *x, int *y) {
    int aide = *x;
    *x = *y;
    *y = aide;
}

void tri_selection_decroissant(int *T, int N) {
    int i, j, p_max;

    for (i = 0; i < N - 1; i++) {
        p_max = i;

        for (j = i + 1; j < N; j++) {
            if (T[j] > T[p_max]) {
                p_max = j;
            }
        }

        if (p_max != i) {
            permuter(&T[i], &T[p_max]);
        }
    }
}

int main(void) {
    int *T;
    int N, i;

    do {
        printf("Donnez la dimension N : ");
        scanf("%d", &N);
    } while (N <= 0);

    T = (int *)malloc(N * sizeof(int));
    if (T == NULL) {
        printf("Pas assez de memoire.\n");
        return 1;
    }

    printf("Entrez les elements du tableau :\n");
    for (i = 0; i < N; i++) {
        printf("T[%d] = ", i);
        scanf("%d", &T[i]);
    }

    tri_selection_decroissant(T, N);

    printf("\nTableau trie en ordre decroissant :\n");
    for (i = 0; i < N; i++) {
        printf("%d ", T[i]);
    }
    printf("\n");

    free(T);
    T = NULL;

    return 0;
}
