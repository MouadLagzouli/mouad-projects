#include <stdio.h>

/*-----------------------------------------------------------
  Programme : Table de multiplication
  Objectif :
    - Lire un nombre entier
    - Calculer sa table de multiplication jusqu'à 10
    - Stocker les résultats dans un tableau
    - Afficher la table
-----------------------------------------------------------*/

int main() {
    int nombre, i;
    int table[10];

    /* Lecture du nombre */
    printf("Entrez un nombre : ");
    scanf("%d", &nombre);

    /* Calcul de la table de multiplication */
    for (i = 0; i < 10; i++) {
        table[i] = nombre * (i + 1);
    }

    /* Affichage de la table */
    printf("Table de multiplication de %d :\n", nombre);
    for (i = 0; i < 10; i++) {
        printf("%d x %d = %d\n", nombre, i + 1, table[i]);
    }

    return 0;
}
