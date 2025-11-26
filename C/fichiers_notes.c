#include <stdio.h>

int main() {
    FILE *f = fopen("notes.txt", "w");

    if (!f) {
        printf("Erreur d'ouverture du fichier\n");
        return 1;
    }

    fprintf(f, "Mouad Lagzouli - Note : 17.5/20\n");
    fprintf(f, "Etudiant 2 - Note : 14/20\n");

    fclose(f);

    // Lecture du fichier
    f = fopen("notes.txt", "r");

    char ligne[100];
    printf("\n=== Contenu du fichier ===\n");
    while (fgets(ligne, sizeof(ligne), f) != NULL) {
        printf("%s", ligne);
    }

    fclose(f);
    return 0;
}
