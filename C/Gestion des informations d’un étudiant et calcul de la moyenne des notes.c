#include <stdio.h>

/* Fonction de saisie des informations de l'étudiant */
void lireEtudiant(char *nom, char *prenom, int *age, float notes[], int n) {
    int i;

    printf("Lire le nom : ");
    scanf("%s", nom);

    printf("Lire le prenom : ");
    scanf("%s", prenom);

    printf("Lire l'age : ");
    scanf("%d", age);

    for (i = 0; i < n; i++) {
        printf("Note du module %d : ", i + 1);
        scanf("%f", &notes[i]);
    }
}

int main() {
    int i, N, age;
    float moyenne = 0.0, notes[50];
    char nom[50], prenom[50];

    printf("Entrer le nombre de modules : ");
    scanf("%d", &N);

    lireEtudiant(nom, prenom, &age, notes, N);

    printf("\n--- Informations de l'etudiant ---\n");
    printf("Nom : %s\n", nom);
    printf("Prenom : %s\n", prenom);
    printf("Age : %d\n", age);

    printf("\n--- Notes ---\n");
    for (i = 0; i < N; i++) {
        printf("Module %d : %.2f\n", i + 1, notes[i]);
        moyenne += notes[i];
    }

    moyenne /= N;
    printf("\nMoyenne des notes : %.2f\n", moyenne);

    return 0;
}
