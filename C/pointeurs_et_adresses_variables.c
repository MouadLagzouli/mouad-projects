#include <stdio.h>
#include <stdlib.h>

int main(void) {
    int a;
    float b;
    char c;

    printf("Entrez les valeurs de a, b et c : ");
    scanf("%d %f %c", &a, &b, &c);

    printf("---- Valeurs initiales et adresses ----\n");
    printf("a = %d, adresse (hex) : %p\n", a, (void *)&a);
    printf("b = %f, adresse (hex) : %p\n", b, (void *)&b);
    printf("c = %c, adresse (hex) : %p\n", c, (void *)&c);

    int   *pa = &a;
    float *pb = &b;
    char  *pc = &c;

    *pa = 20;
    *pb = 207.98f;
    *pc = 'R';

    printf("\n---- Valeurs modifiées via les pointeurs ----\n");
    printf("a = %d, adresse (hex) : %p\n", a, (void *)&a);
    printf("b = %f, adresse (hex) : %p\n", b, (void *)&b);
    printf("c = %c, adresse (hex) : %p\n", c, (void *)&c);

    return 0;
}
