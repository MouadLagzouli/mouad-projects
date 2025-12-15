#include <stdio.h>
#include <stdlib.h>

int main() {
    int n, i = 1;
    unsigned long long fact = 1;

    printf("Entrez un entier n >= 0 : ");
    scanf("%d", &n);

    while (i <= n) {
        fact *= i;
        i++;
    }

    printf("La factorielle de %d est : %llu\n", n, fact);

    return 0;
}
