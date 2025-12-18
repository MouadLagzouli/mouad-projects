#include <stdio.h>
#include <stdlib.h>

void SuppOcc(char CH1[], char CH2[]);

int main() {
    char chaine1[100];
    char chaine2[100];

    printf("Entrer la chaine1 : ");
    fgets(chaine1, sizeof(chaine1), stdin);

    printf("Entrer la chaine2 : ");
    fgets(chaine2, sizeof(chaine2), stdin);

    for (int i = 0; chaine1[i] != '\0'; i++) {
        if (chaine1[i] == '\n') {
            chaine1[i] = '\0';
            break;
        }
    }
    for (int i = 0; chaine2[i] != '\0'; i++) {
        if (chaine2[i] == '\n') {
            chaine2[i] = '\0';
            break;
        }
    }

    /* Suppression de la première occurrence */
    SuppOcc(chaine1, chaine2);

    /* Affichage */
    printf("Resultat : ");
    puts(chaine1);

    return 0;
}

/*-----------------------------------------------------------
  SuppOcc : supprime la première occurrence de CH2 dans CH1
  - Si CH2 n'existe pas dans CH1 : CH1 reste inchangée
-----------------------------------------------------------*/
void SuppOcc(char CH1[], char CH2[]) {
    int i, j, k;
    int occur = 0;

    /* Si CH2 est vide, on ne fait rien */
    if (CH2[0] == '\0')
        return;

    for (i = 0; CH1[i] != '\0' && !occur; i++) {

        /* Vérifier si CH2 correspond à partir de la position i */
        for (j = 0; CH2[j] != '\0' && CH1[i + j] == CH2[j]; j++);

        /* Si on a atteint la fin de CH2 => occurrence trouvée */
        if (CH2[j] == '\0') {
            occur = 1;

            /* Décalage à gauche pour supprimer CH2 */
            for (k = i; CH1[k + j] != '\0'; k++) {
                CH1[k] = CH1[k + j];
            }
            CH1[k] = '\0';
        }
    }
}
