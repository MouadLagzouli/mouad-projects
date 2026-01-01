#include <stdio.h>

int recherche_lineaire(const int t[], int n, int val) {
    for (int i = 0; i < n; i++) {
        if (t[i] == val) return i;
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

    int pos = recherche_lineaire(t, n, val);

    if (pos == -1)
        printf("Valeur %d non trouvee.\n", val);
    else
        printf("Valeur %d trouvee a l'index %d.\n", val, pos);

    return 0;
}
