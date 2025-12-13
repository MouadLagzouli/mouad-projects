#include <stdio.h>

int main(void) {
    int T[100], N, i;
    int somme = 0, produit = 1;
    float moyenne;

    do {
        printf("Donnez N (2 <= N <= 100) : ");
        scanf("%d", &N);
    } while (N < 2 || N > 100);

    // Lecture du tableau
    for (i = 0; i < N; i++) {
        printf("Donnez T[%d] : ", i);
        scanf("%d", &T[i]);
    }

    // Calcul de la somme et du produit
    for (i = 0; i < N; i++) {
        somme += T[i];
        produit *= T[i];
    }

    moyenne = (float)somme / N;

    // Affichage des résultats
    printf("\nLa somme des elements : %d\n", somme);
    printf("Le produit des elements : %d\n", produit);
    printf("La moyenne des elements : %.2f\n", moyenne);

    return 0;
}
