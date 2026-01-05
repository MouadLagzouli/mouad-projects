import java.util.Scanner;

public class Matrice {

    private int[][] data;
    private int lignes;
    private int colonnes;

    public Matrice(int lignes, int colonnes) {
        this.lignes = lignes;
        this.colonnes = colonnes;
        data = new int[lignes][colonnes];
    }

    public void lire(Scanner sc, String nom) {
        System.out.println("Lecture Matrice " + nom + " (" + lignes + " x " + colonnes + ") :");
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                System.out.print(nom + "[" + i + "][" + j + "] = ");
                data[i][j] = sc.nextInt();
            }
        }
    }

    public void afficher(String titre) {
        System.out.println("\n=== " + titre + " ===");
        for (int i = 0; i < lignes; i++) {
            for (int j = 0; j < colonnes; j++) {
                System.out.printf("%5d ", data[i][j]);
            }
            System.out.println();
        }
    }

    public int get(int i, int j) {
        return data[i][j];
    }

    public int getLignes() {
        return lignes;
    }

    public int getColonnes() {
        return colonnes;
    }
}
