#include <stdio.h>

void triInsertion(int T[], int n) {
    int i, clé, j;

    for (i = 1; i < n; i++) {
        clé = T[i];
        j = i - 1;

        while (j >= 0 && T[j] > clé) {
            T[j + 1] = T[j];
            j--;
        }
        T[j + 1] = clé;
    }
}

int main() {
    int T[] = {5, 2, 9, 1, 3};
    int n = sizeof(T) / sizeof(T[0]);

    printf("Tableau avant tri : ");
    for (int i = 0; i < n; i++) printf("%d ", T[i]);

    triInsertion(T, n);

    printf("\nTableau après tri (insertion) : ");
    for (int i = 0; i < n; i++) printf("%d ", T[i]);

    return 0;
}
