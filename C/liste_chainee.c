/* Liste chaînée : Insertion & Suppression */
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct personne {
    char nom[20];
    struct personne *suivant;
};

/* Lire une chaine en sécurité (remplace gets) */
void lireNom(char nom[], int taille) {
    fgets(nom, taille, stdin);
    nom[strcspn(nom, "\n")] = '\0'; /* supprimer le \n */
}

/* Affichage de la liste */
void afficherListe(struct personne *TETE) {
    struct personne *p = TETE;
    printf("\nListe : ");
    while (p != NULL) {
        printf("[%s] -> ", p->nom);
        p = p->suivant;
    }
    printf("NULL\n");
}

int main() {
    struct personne *nouveau;
    struct personne *courant;
    struct personne *marqueur;
    struct personne *TETE = NULL;

    /* --- Insertion en tête : 3 personnes --- */
    for (int k = 0; k < 3; k++) {
        nouveau = (struct personne *)malloc(sizeof(struct personne));
        if (nouveau == NULL) {
            printf("Erreur d'allocation memoire.\n");
            exit(-1);
        }

        printf("Donnez un nom : ");
        lireNom(nouveau->nom, sizeof(nouveau->nom));

        nouveau->suivant = TETE;
        TETE = nouveau;
    }

    afficherListe(TETE);

    /* --- Insertion en fin --- */
    courant = TETE;
    while (courant->suivant != NULL)
        courant = courant->suivant;

    nouveau = (struct personne *)malloc(sizeof(struct personne));
    if (nouveau == NULL) {
        printf("Erreur d'allocation memoire.\n");
        exit(-1);
    }

    printf("Donnez un nom (ajout en fin) : ");
    lireNom(nouveau->nom, sizeof(nouveau->nom));

    courant->suivant = nouveau;
    nouveau->suivant = NULL;

    afficherListe(TETE);

    /* --- Insertion après "ADAM" (si existe) --- */
    marqueur = TETE;
    while (marqueur != NULL && strcmp(marqueur->nom, "ADAM") != 0)
        marqueur = marqueur->suivant;

    if (marqueur != NULL) {
        nouveau = (struct personne *)malloc(sizeof(struct personne));
        if (nouveau == NULL) {
            printf("Erreur d'allocation memoire.\n");
            exit(-1);
        }

        printf("Donnez un nom (ajout apres ADAM) : ");
        lireNom(nouveau->nom, sizeof(nouveau->nom));

        nouveau->suivant = marqueur->suivant;
        marqueur->suivant = nouveau;
    } else {
        printf("Le nom 'ADAM' n'existe pas dans la liste (insertion ignoree).\n");
    }

    afficherListe(TETE);

    /* --- Suppression du premier élément --- */
    if (TETE != NULL) {
        courant = TETE;
        TETE = TETE->suivant;
        free(courant);
    }

    afficherListe(TETE);

    /* --- Suppression du dernier élément --- */
    if (TETE != NULL) {
        struct personne *courant1 = TETE;
        struct personne *courant2 = TETE->suivant;

        /* cas : un seul élément */
        if (courant2 == NULL) {
            free(TETE);
            TETE = NULL;
        } else {
            while (courant2->suivant != NULL) {
                courant1 = courant2;
                courant2 = courant2->suivant;
            }
            courant1->suivant = NULL;
            free(courant2);
        }
    }

    afficherListe(TETE);

/* --- Libération complète (bonne pratique) --- */
    while (TETE != NULL) {
        courant = TETE;
        TETE = TETE->suivant;
        free(courant);
    }

    return 0;
}
