#include <stdio.h>

int dicho_croissant(const int t[], int n, int val) {
    int g = 0, d = n - 1;

    while (g <= d) {
        int m = g + (d - g) / 2;

        if (t[m] == val) return m;
        if (val < t[m]) d = m - 1;
        else g = m + 1;
    }
    return -1;
}

int main(void) {
    int n, val;

    printf("Donner N : ");
    scanf("%d", &n);

    int t[n];
    printf("Entrer un tableau TRIE CROISSANT :\n");
    for (int i = 0; i < n; i++) {
        printf("t[%d] = ", i);
        scanf("%d", &t[i]);
    }

    printf("Valeur a rechercher : ");
    scanf("%d", &val);

    int pos = dicho_croissant(t, n, val);

    if (pos == -1)
        printf("Valeur %d non trouvee.\n", val);
    else
        printf("Valeur %d trouvee a l'index %d.\n", val, pos);

    return 0;
}
