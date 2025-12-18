#include <stdio.h>
#include <stdlib.h>

int  ligneMax(int *mat, int L, int C);
int  estSymetrique(int *mat, int L, int C);
void sommeDiag(int *mat, int L, int C);

int main() {
    int *Tab;
    int L, C;

    /* Lecture des dimensions */
    printf("Donner le nombre de lignes : ");
    scanf("%d", &L);

    printf("Donner le nombre de colonnes : ");
    scanf("%d", &C);

    /* Allocation dynamique : matrice L x C */
    Tab = (int *)malloc(L * C * sizeof(int));
    if (Tab == NULL) {
        printf("Erreur d'allocation memoire.\n");
        exit(-1);
    }

    /* Saisie */
    for (int i = 0; i < L; i++) {
        for (int j = 0; j < C; j++) {
            printf("Entrer Tab[%d][%d] : ", i, j);
            scanf("%d", (Tab + i * C + j));
        }
    }

    /* Affichage */
    printf("\n--- Matrice ---\n");
    for (int i = 0; i < L; i++) {
        for (int j = 0; j < C; j++) {
            printf("%4d", *(Tab + i * C + j));
        }
        printf("\n");
    }

    /* Ligne avec somme maximale */
    int pmax = ligneMax(Tab, L, C);
    printf("\nLa ligne avec la somme max est : %d\n", pmax);

    /* Test de symetrie */
    if (L != C) {
        printf("La matrice n'est pas carree : test de symetrie impossible.\n");
    } else {
        int test = estSymetrique(Tab, L, C);
        if (test == 1)
            printf("La matrice est symetrique.\n");
        else
            printf("La matrice n'est pas symetrique.\n");
    }

    /* Somme diagonale */
    sommeDiag(Tab, L, C);

    /* Liberation */
    free(Tab);

    return 0;
}

/*-----------------------------------------------------------
  ligneMax : retourne le numero de la ligne (1..L)
  ayant la somme des elements la plus grande
-----------------------------------------------------------*/
int ligneMax(int *mat, int L, int C) {
    int sommeMax;
    int pmax = 0;

    /* Initialisation avec la somme de la premiere ligne */
    sommeMax = 0;
    for (int j = 0; j < C; j++) {
        sommeMax += *(mat + 0 * C + j);
    }

    /* Parcours des autres lignes */
    for (int i = 1; i < L; i++) {
        int somLigne = 0;
        for (int j = 0; j < C; j++) {
            somLigne += *(mat + i * C + j);
        }
        if (somLigne > sommeMax) {
            sommeMax = somLigne;
            pmax = i;
        }
    }

    return pmax + 1; /* ligne numerotee a partir de 1 */
}

/*-----------------------------------------------------------
  estSymetrique : retourne 1 si la matrice est symetrique,
  0 sinon (suppose matrice carree)
-----------------------------------------------------------*/
int estSymetrique(int *mat, int L, int C) {
    for (int i = 0; i < L; i++) {
        for (int j = i + 1; j < C; j++) { /* j=i+1 suffit */
            if (*(mat + i * C + j) != *(mat + j * C + i)) {
                return 0;
            }
        }
    }
    return 1;
}

/*-----------------------------------------------------------
  sommeDiag : calcule et affiche la somme de la diagonale
  principale si la matrice est carree
-----------------------------------------------------------*/
void sommeDiag(int *mat, int L, int C) {
    int somme = 0;

    if (L != C) {
        printf("La matrice n'est pas carree : pas de diagonale principale.\n");
        return;
    }

    for (int i = 0; i < L; i++) {
        somme += *(mat + i * C + i);
    }

    printf("La somme de la diagonale principale est : %d\n", somme);
}
