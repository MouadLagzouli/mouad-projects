#include <stdio.h>

/* Fonction qui calcule :
   - np   : nombre d’éléments pairs
   - nimp : nombre d’éléments impairs
   - nbz  : nombre de zéros
*/
void fct3(int t[], int n, int *np, int *nimp, int *nbz) {
    int i;

    for (i = 0; i < n; i++) {
        if (t[i] == 0) {
            (*nbz)++;
        } else if (t[i] % 2 == 0) {
            (*np)++;
        } else {
            (*nimp)++;
        }
    }
}

int main() {
    int N, i;
    int NP = 0, NIMP = 0, NBZ = 0;
    int T[50];

    printf("Entrer la dimension de T : ");
    scanf("%d", &N);

    for (i = 0; i < N; i++) {
        printf("Entrer T[%d] : ", i);
        scanf("%d", &T[i]);
    }

    /* Appel de la fonction */
    fct3(T, N, &NP, &NIMP, &NBZ);

    printf("\nLe nombre de zéros : %d\n", NBZ);
    printf("Le nombre d’elements pairs : %d\n", NP);
    printf("Le nombre d’elements impairs : %d\n", NIMP);

    return 0;
}
