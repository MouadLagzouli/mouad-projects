#include <stdio.h>

/*-----------------------------------------------------------
  Programme : Somme des entiers de 1 à N
  Objectif :
    - Lire un entier N
    - Stocker les entiers de 1 à N dans un tableau
    - Calculer et afficher leur somme
-----------------------------------------------------------*/

int main() {
    int N, somme = 0;
    int i;

    /* Lecture de N */
    printf("Entrez un nombre entier N : ");
    scanf("%d", &N);

    /* Déclaration du tableau */
    int tableau[N];

    /* Remplissage du tableau avec les valeurs de 1 à N */
    for (i = 0; i < N; i++) {
        tableau[i] = i + 1;
    }

    /* Calcul de la somme */
    for (i = 0; i < N; i++) {
        somme += tableau[i];
    }

    /* Affichage du résultat */
    printf("La somme des entiers de 1 a %d est : %d\n", N, somme);

    return 0;
}
