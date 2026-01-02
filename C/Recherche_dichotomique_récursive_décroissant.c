#include <stdio.h>

int dicho_rec_decroissant(const int t[], int debut, int fin, int val) {
    if (debut > fin) return -1;

    int m = debut + (fin - debut) / 2;

    if (t[m] == val) return m;
    if (val > t[m]) return dicho_rec_decroissant(t, debut, m - 1, val); /* inversé */
    return dicho_rec_decroissant(t, m + 1, fin, val);
}

int main(void) {
    int n, val;

    printf("Donner N : ");
    scanf("%d", &n);

    int t[n];
    printf("Entrer un tableau TRIE DECROISSANT :\n");
    for (int i = 0; i < n; i++) {
        printf("t[%d] = ", i);
        scanf("%d", &t[i]);
    }

    printf("Valeur a rechercher : ");
    scanf("%d", &val);

    int pos = dicho_rec_decroissant(t, 0, n - 1, val);

    if (pos == -1)
        printf("Valeur %d non trouvee.\n", val);
    else
        printf("Valeur %d trouvee a l'index %d.\n", val, pos);

    return 0;
}
