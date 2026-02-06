import java.util.ArrayList;
import java.util.Scanner;

public class MenuConsole {
    private Banque banque;
    private Scanner sc;

    public MenuConsole() {
        banque = new Banque();
        sc = new Scanner(System.in);
    }
public void demarrer() {
        int choix;
        do {
            afficherMenu();
            choix = lireEntier("Votre choix: ");

            switch (choix) {
                case 1: creerCompte(); break;
                case 2: supprimerCompte(); break;
                case 3: deposer(); break;
                case 4: retirer(); break;
                case 5: chercherParNumero(); break;
                case 6: chercherParNom(); break;
                case 7: afficherTout(); break;
                case 8: afficherHistorique(); break;
                case 0: System.out.println("Au revoir !"); break;
                default: System.out.println("Choix invalide.");
            }

            
