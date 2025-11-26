#include <stdio.h>

void triBulle(int T[], int n) {
    int i, j, temp;
    for (i = 0; i < n - 1; i++) {
        for (j = 0; j < n - i - 1; j++) {
            if (T[j] > T[j + 1]) {
                temp = T[j];
                T[j] = T[j + 1];
                T[j + 1] = temp;
            }
        }
    }
}

int main() {
    int T[] = {5, 2, 9, 1, 3};
    int n = sizeof(T) / sizeof(T[0]);

    printf("Tableau avant tri : ");
    for (int i = 0; i < n; i++) printf("%d ", T[i]);

    triBulle(T, n);

    printf("\nTableau après tri (bulle) : ");
    for (int i = 0; i < n; i++) printf("%d ", T[i]);

    return 0;
}
