#include <stdio.h>

/*-----------------------------------------------------------
  Fonction trier :
  - Trie trois entiers par ordre croissant
  - Utilise le passage par adresse
-----------------------------------------------------------*/
void trier(int *A, int *B, int *C) {
    int AIDE;

    if (*A > *B) {
        AIDE = *A;
        *A = *B;
        *B = AIDE;
    }

    if (*A > *C) {
        AIDE = *A;
        *A = *C;
        *C = AIDE;
    }

    if (*B > *C) {
        AIDE = *B;
        *B = *C;
        *C = AIDE;
    }
}

int main() {
    int A, B, C;

    /* Lecture des valeurs */
    printf("Entrez 3 entiers : ");
    scanf("%d %d %d", &A, &B, &C);

    /* Affichage avant le tri */
    printf("Avant le tri : A = %d, B = %d, C = %d\n", A, B, C);

    /* Appel de la fonction trier */
    trier(&A, &B, &C);

    /* Affichage après le tri */
    printf("Apres le tri  : A = %d, B = %d, C = %d\n", A, B, C);

    return 0;
}
