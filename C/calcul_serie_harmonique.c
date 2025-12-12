#include <stdio.h>
#include <stdlib.h>

double serie_harmonique(int N);

int main() {
    int N;
    double somme = 0;

    do {
        printf("Entrez la valeur de N : ");
        scanf("%d", &N);
    } while (N <= 0);

    somme = serie_harmonique(N);

    printf("La somme de la série harmonique est : %f\n", somme);

    return 0;
}

double serie_harmonique(int N) {
    double somme = 0.0;

    for (int i = 1; i <= N; i++) {
        somme += 1.0 / i;  
    }

    return somme;
}
