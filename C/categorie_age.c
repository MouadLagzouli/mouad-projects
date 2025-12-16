#include <stdio.h>

/*-----------------------------------------------------------
  Programme : Catégorie d'âge
  Description :
    - Saisir l'âge d'une personne
    - Vérifier si l'âge est valide
    - Afficher la catégorie correspondante
-----------------------------------------------------------*/

int main() {
    int age;

    /* Lecture de l'âge */
    printf("Entrez votre age : ");
    scanf("%d", &age);

    /* Vérification de validité */
    if (age < 0) {
        printf("Age invalide.\n");
    }
    else if (age < 12) {
        printf("Vous etes un enfant.\n");
    }
    else if (age < 18) {
        printf("Vous etes un adolescent.\n");
    }
    else if (age < 65) {
        printf("Vous etes un adulte.\n");
    }
    else {
        printf("Vous etes un senior.\n");
    }

    return 0;
}
