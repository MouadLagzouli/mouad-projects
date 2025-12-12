#include <stdio.h>
#include <stdlib.h>

double racine_carre(double A);

int main(void) {
    double A, R;

    printf("Entrez A : ");
    scanf("%lf", &A);

    R = racine_carre(A);

    printf("La racine par approximation de %.6f est %.6f\n", A, R);
    return 0;
}

double racine_carre(double A) {
    int J;
    double X;

    if (A < 0) {
        printf("Le nombre A doit etre positif.\n");
        exit(EXIT_FAILURE);
    }

    if (A == 0) return 0.0;

    do {
        printf("Entrez J (10 <= J <= 50) : ");
        scanf("%d", &J);
    } while (J < 10 || J > 50);

    X = A; 
  
    for (int i = 1; i <= J; i++) {
        X = (X + A / X) / 2.0;
    }

    return X;
}
