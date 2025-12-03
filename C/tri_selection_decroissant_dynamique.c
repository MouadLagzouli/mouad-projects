#include <stdio.h>
#include <stdlib.h>

int main(void) {
    int *T = NULL;
    int N, i, j;
    int aide, p_max;

    do {
        printf("Donnez N (N > 0) : ");
        scanf("%d", &N);
    } while (N <= 0);

    T = (int *)malloc(N * sizeof(int));
    if (T == NULL) {
        printf("Pas assez de memoire.\n");
        exit(EXIT_FAILURE);
    }

    printf("\nEntrez les elements du tableau :\n");
    for (i = 0; i < N; i++) {
        printf("T[%d] = ", i);
        scanf("%d", T + i);  
    }

    printf("\nTableau initial :\n");
    for (i = 0; i < N; i++) {
        printf("T[%d] = %d\n", i, *(T + i));
    }

    printf("\nTri du tableau (ordre decroissant)...\n");
    for (i = 0; i < N - 1; i++) {
        p_max = i;

      for (j = i + 1; j < N; j++) {
            if (*(T + p_max) < *(T + j)) {
                p_max = j;
            }
        }
        if (p_max != i) {
            aide = *(T + p_max);
            *(T + p_max) = *(T + i);
            *(T + i) = aide;
        }
    }

    printf("\nTableau trie en ordre decroissant :\n");
    for (i = 0; i < N; i++) {
        printf("%d ", *(T + i));
    }
    printf("\n");

    free(T);
    T = NULL;

    return 0;
}
