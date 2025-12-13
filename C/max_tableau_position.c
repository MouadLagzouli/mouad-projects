#include <stdio.h>

int main(void) {
    int T[50], N, i;
    int p_max;

    do {
        printf("Donnez 3 <= N <= 50 : ");
        scanf("%d", &N);
    } while (N < 3 || N > 50);

    // Lecture du tableau
    for (i = 0; i < N; i++) {
        printf("Donnez T[%d] : ", i);
        scanf("%d", &T[i]);
    }

    // Affichage du tableau
    printf("\nLes elements du tableau sont :\n");
    for (i = 0; i < N; i++) {
        printf("T[%d] = %d\n", i, T[i]);
    }

    // Recherche du maximum
    p_max = 0;
    for (i = 1; i < N; i++) {
        if (T[i] > T[p_max]) {
            p_max = i;
        }
    }

    printf("\nLe maximum dans le tableau est : %d\n", T[p_max]);
    printf("La position du maximum (indice du tableau) est : %d\n", p_max);

    return 0;
}
