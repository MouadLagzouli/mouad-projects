#include <stdio.h>

int main(void) {
    int c;

    printf("Affichage de la table ASCII :\n");

    for (c = 0; c <= 127; c++) {
        printf("Code ASCII %3d -> Caractere : %c\n", c, c);
    }

    return 0;
}
