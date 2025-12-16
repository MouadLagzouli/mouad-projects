#include <stdio.h>

/*-----------------------------------------------------------
  Fonction max : retourne le maximum de trois entiers
-----------------------------------------------------------*/
int max(int a, int b, int c) {
    int m = a;

    if (b > m)
        m = b;
    if (c > m)
        m = c;

    return m;
}

int main() {
    int A, B, C;
    int MAX;

    printf("Introduisez trois nombres entiers : ");
    scanf("%d %d %d", &A, &B, &C);

    MAX = max(A, B, C);

    printf("La valeur maximale est : %d\n", MAX);

    return 0;
}
