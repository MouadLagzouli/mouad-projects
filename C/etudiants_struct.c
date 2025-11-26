#include <stdio.h>

typedef struct {
    char nom[30];
    char prenom[30];
    int age;
    float moyenne;
} Etudiant;

int main() {
    int n;
    printf("Combien d'etudiants ? ");
    scanf("%d", &n);

    Etudiant T[n];

    for (int i = 0; i < n; i++) {
        printf("\n--- Etudiant %d ---\n", i + 1);

        printf("Nom : ");
        scanf("%s", T[i].nom);

        printf("Prenom : ");
        scanf("%s", T[i].prenom);

        printf("Age : ");
        scanf("%d", &T[i].age);

        printf("Moyenne : ");
        scanf("%f", &T[i].moyenne);
    }

    printf("\n\n===== Liste des étudiants =====\n");
    for (int i = 0; i < n; i++) {
        printf("%s %s - %d ans - %.2f/20\n",
               T[i].nom, T[i].prenom, T[i].age, T[i].moyenne);
    }

    return 0;
}
