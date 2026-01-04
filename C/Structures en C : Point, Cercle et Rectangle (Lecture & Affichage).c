#include <stdio.h>

struct Point {
    float x;
    float y;
};

struct Cercle {
    float xc;
    float yc;
    float rayon;
};

struct Rectangle {
    float L;
    float l;
};

int main() {
    struct Point p1, p2;
    struct Cercle c1, c2;
    struct Rectangle R1, R2;

    printf("Entrer les champs du point p1 (x y) : ");
    scanf("%f %f", &p1.x, &p1.y);
    printf("Point p1 : %.2f %.2f\n\n", p1.x, p1.y);

    printf("Entrer les champs du point p2 (x y) : ");
    scanf("%f %f", &p2.x, &p2.y);
    printf("Point p2 : %.2f %.2f\n\n", p2.x, p2.y);

    printf("Entrer les champs du cercle c1 (xc yc rayon) : ");
    scanf("%f %f %f", &c1.xc, &c1.yc, &c1.rayon);
    printf("Cercle c1 : centre(%.2f, %.2f), rayon = %.2f\n\n", c1.xc, c1.yc, c1.rayon);

    printf("Entrer les champs du cercle c2 (xc yc rayon) : ");
    scanf("%f %f %f", &c2.xc, &c2.yc, &c2.rayon);
    printf("Cercle c2 : centre(%.2f, %.2f), rayon = %.2f\n\n", c2.xc, c2.yc, c2.rayon);

    printf("Entrer les champs du rectangle R1 (L l) : ");
    scanf("%f %f", &R1.L, &R1.l);
    printf("Rectangle R1 : L = %.2f, l = %.2f\n\n", R1.L, R1.l);

    printf("Entrer les champs du rectangle R2 (L l) : ");
    scanf("%f %f", &R2.L, &R2.l);
    printf("Rectangle R2 : L = %.2f, l = %.2f\n", R2.L, R2.l);

    return 0;
}
