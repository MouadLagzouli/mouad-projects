#include <stdio.h>
#include <stdlib.h>

/*-----------------------------------------------------------
  PILE (Stack) avec Liste Chaînée
  - Chaque élément contient :
      info    : valeur (float)
      suivant : pointeur vers l'élément suivant
  - Principe LIFO : Dernier entré, premier sorti
-----------------------------------------------------------*/

struct PILE_LISTE {
    float info;
    struct PILE_LISTE *suivant;
};

/*-----------------------------------------------------------
  initialiserPile : met la pile à l'état vide
-----------------------------------------------------------*/
void initialiserPile(struct PILE_LISTE **p) {
    *p = NULL;
}

/*-----------------------------------------------------------
  pileVide : retourne 1 si pile vide, sinon 0
-----------------------------------------------------------*/
int pileVide(struct PILE_LISTE *p) {
    if (p == NULL)
        return 1;
    else
        return 0;
}

/*-----------------------------------------------------------
  Sommet : retourne la valeur au sommet (sans dépiler)
  (appelée seulement si pile non vide)
-----------------------------------------------------------*/
float Sommet(struct PILE_LISTE *p) {
    return (p->info);
}

/*-----------------------------------------------------------
  empilerElement : empile un élément e au sommet de la pile
  Retour :
    1 -> succès
    0 -> échec (allocation mémoire impossible)
-----------------------------------------------------------*/
int empilerElement(struct PILE_LISTE **p, float e) {
    struct PILE_LISTE *Nouveau;

    /* allocation d'un nouveau maillon */
    if ((Nouveau = (struct PILE_LISTE *)malloc(sizeof(struct PILE_LISTE)))) {
        Nouveau->info = e;
        Nouveau->suivant = *p;
        *p = Nouveau;
        return 1;
    } else
        return 0;
}

/*-----------------------------------------------------------
  depilerElement : dépile l'élément du sommet
  Paramètre :
    e -> récupère la valeur dépilée
  Retour :
    1 -> succès
    0 -> pile vide
-----------------------------------------------------------*/
int depilerElement(struct PILE_LISTE **p, float *e) {
    struct PILE_LISTE *courant;

    if (!pileVide(*p)) {
        *e = Sommet(*p);      /* récupérer la valeur du sommet */
        courant = *p;         /* garder l'adresse du sommet */
        *p = (*p)->suivant;   /* avancer le sommet */
        free(courant);        /* libérer l'ancien sommet */
        return 1;
    } else
        return 0;
}

/*-----------------------------------------------------------
  Programme principal de test :
  - Empiler 5 éléments
  - Puis dépiler tout en affichant l'ordre de sortie
-----------------------------------------------------------*/
int main() {
    float info;
    int Test;
    int i;
    struct PILE_LISTE *PILE_LST;

    initialiserPile(&PILE_LST);

    for (i = 1; i <= 5; i++) {
        printf("Empiler element n : %d\n", i);
        scanf("%f", &info);

        Test = empilerElement(&PILE_LST, info);
        if (Test == 0) {
            printf("impossible d empiler\n");
            exit(-30);
        }
    }

    i--;

    printf("-----------------------------------------Depiler la pile-------------\n\n");
    while (!pileVide(PILE_LST)) {
        depilerElement(&PILE_LST, &info);
        printf("DEpiler element %d de la pile : %f\n", i, info);
        i--;
    }

    return 0;
}
