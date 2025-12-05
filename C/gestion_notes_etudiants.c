#include <stdio.h>

int main(void) {
    int n, m;

    printf("Entrez le nombre d'étudiants : ");
    scanf("%d", &n);
    printf("Entrez le nombre de matières par étudiant : ");
    scanf("%d", &m);

    float notes[n][m];        
    float moyennes[n];         
    float moyenneGenerale = 0;  
    float noteMax = 0;         
    float noteMin = 100;        

    for (int i = 0; i < n; i++) {
        printf("\nÉtudiant %d :\n", i + 1);
        float somme = 0;

        for (int j = 0; j < m; j++) {
            printf("  Entrez la note pour la matière %d : ", j + 1);
            scanf("%f", &notes[i][j]);

            somme += notes[i][j]; 

            if (notes[i][j] > noteMax) noteMax = notes[i][j];
            if (notes[i][j] < noteMin) noteMin = notes[i][j];
        }

        moyennes[i] = somme / m;   
        moyenneGenerale += moyennes[i];
    }

  
    moyenneGenerale /= n;

    
    printf("\n--- Résultats ---\n");
    for (int i = 0; i < n; i++) {
        printf("Moyenne de l'étudiant %d : %.2f\n", i + 1, moyennes[i]);
    }

    printf("Note la plus élevée : %.2f\n", noteMax);
    printf("Note la plus basse : %.2f\n", noteMin);
    printf("Moyenne générale : %.2f\n", moyenneGenerale);

    return 0;
}
