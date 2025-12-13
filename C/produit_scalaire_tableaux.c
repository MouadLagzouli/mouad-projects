#include <stdio.h>

int main(void) {
    int T1[50], T2[50];
    int N, i;
    int PS = 0;

    do {
        printf("Donnez 3 <= N <= 50 : ");
        scanf("%d", &N);
    } while (N < 3 || N > 50);

    // Lecture du premier tableau
    for (i = 0; i < N; i++) {
        printf("Donnez T1[%d] : ", i);
        scanf("%d", &T1[i]);
    }

    // Lecture du second tableau
    for (i = 0; i < N; i++) {
        printf("Donnez T2[%d] : ", i);
        scanf("%d", &T2[i]);
    }

    // Calcul du produit scalaire
    for (i = 0; i < N; i++) {
        PS += T1[i] * T2[i];
    }

    printf("Le produit scalaire est : %d\n", PS);

    return 0;
}
