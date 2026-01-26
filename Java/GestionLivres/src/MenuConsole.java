import java.util.ArrayList;
import java.util.Scanner;

public class MenuConsole {
    private Catalogue catalogue;
    private Scanner sc;

    public MenuConsole() {
        catalogue = new Catalogue();
        sc = new Scanner(System.in);
    }
 public void demarrer() {
        int choix;
        do {
            afficherMenu();
            choix = lireEntier("Votre choix: ");

            switch (choix) {
                case 1: ajouterLivre(); break;
                case 2: supprimerLivre(); break;
                case 3: chercherParISBN(); break;
                case 4: chercherParAuteur(); break;
                case 5: chercherParTitre(); break;
                case 6: afficherTous(); break;
                case 0: System.out.println("Au revoir !"); break;
                default: System.out.println("Choix invalide.");
            }
            System.out.println();
        } while (choix != 0);
    }
