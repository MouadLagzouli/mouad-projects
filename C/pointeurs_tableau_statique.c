#include <stdio.h>
#include <stdlib.h>

int main() {
    int T[100], *P, i, N;

    // Lecture de N
    printf("Entrer la dimension du tableau : ");
    scanf("%d", &N);

    if (N <= 0 || N > 100) {
        printf("Dimension invalide.\n");
        return 1;
    }

    P = T; // On fait pointer P sur le début du tableau T

    // Lecture du tableau T
    for (i = 0; i < N; i++) {
        printf("Entrer T[%d] : ", i);
        scanf("%d", P + i);
    }

    // Affichage du tableau via le pointeur P
    printf("\nContenu du tableau :\n");
    for (i = 0; i < N; i++) {
        printf("%d ", *(P + i));
    }
    printf("\n\n");

    // Affichage des adresses
    for (i = 0; i < N; i++) {
        printf("L'adresse de T[%d] est %p, et l'adresse de P+%d est %p\n",
               i, (void*)&T[i], i, (void*)(P + i));
    }

    return 0;
}
