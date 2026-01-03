#include <stdio.h>

int ordre_tableau(const int t[], int n) {
    int croissant = 1, decroissant = 1;
    for (int i = 0; i < n - 1; i++) {
        if (t[i] > t[i + 1]) croissant = 0;
        if (t[i] < t[i + 1]) decroissant = 0;
    }
    if (croissant) return 1;
    if (decroissant) return -1;
    return 0;
}

int recherche_lineaire(const int t[], int n, int val) {
    for (int i = 0; i < n; i++) if (t[i] == val) return i;
    return -1;
}

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

int dicho_decroissant(const int t[], int n, int val) {
    int g = 0, d = n - 1;
    while (g <= d) {
        int m = g + (d - g) / 2;
        if (t[m] == val) return m;
        if (val > t[m]) d = m - 1;  /* inversé */
        else g = m + 1;
    }
    return -1;
}

int main(void) {
    int n, val;

    printf("Donner N : ");
    scanf("%d", &n);

    int t[n];
    for (int i = 0; i < n; i++) {
        printf("t[%d] = ", i);
        scanf("%d", &t[i]);
    }

    printf("Valeur a rechercher : ");
    scanf("%d", &val);

    int ord = ordre_tableau(t, n);
    int pos;

    if (ord == 1) {
        printf("Tableau trie CROISSANT -> recherche dichotomique.\n");
        pos = dicho_croissant(t, n, val);
    } else if (ord == -1) {
        printf("Tableau trie DECROISSANT -> recherche dichotomique.\n");
        pos = dicho_decroissant(t, n, val);
    } else {
        printf("Tableau non trie -> recherche lineaire.\n");
        pos = recherche_lineaire(t, n, val);
    }

    if (pos == -1)
        printf("Valeur %d non trouvee.\n", val);
    else
        printf("Valeur %d trouvee a l'index %d.\n", val, pos);

    return 0;
}
