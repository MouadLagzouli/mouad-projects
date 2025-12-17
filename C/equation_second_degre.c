#include <stdio.h>
#include <math.h>

/*-----------------------------------------------------------
  Programme : Equation du second degré
  Objectif :
    - Lire les coefficients a, b et c
    - Calculer le discriminant Delta
    - Déterminer et afficher les solutions
-----------------------------------------------------------*/

int main() {
    float a, b, c, Delta;

    /* Lecture des coefficients */
    printf("Entrez les coefficients a, b, c de l'equation ax^2 + bx + c = 0 :\n");
    scanf("%f %f %f", &a, &b, &c);

    /* Calcul du discriminant */
    Delta = b * b - 4 * a * c;

    /* Analyse des solutions */
    if (Delta > 0) {
        float x1 = (-b + sqrt(Delta)) / (2 * a);
        float x2 = (-b - sqrt(Delta)) / (2 * a);

        printf("Il y a deux solutions reelles distinctes :\n");
        printf("x1 = %.2f\n", x1);
        printf("x2 = %.2f\n", x2);
    }
    else if (Delta == 0) {
        float x = -b / (2 * a);

        printf("Il y a une solution reelle double :\n");
        printf("x = %.2f\n", x);
    }
    else {
        printf("Il n'y a pas de solution reelle.\n");
    }

    return 0;
}
