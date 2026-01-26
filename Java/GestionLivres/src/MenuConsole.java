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
 private void afficherMenu() {
        System.out.println("==== MENU BIBLIOTHÈQUE ====");
        System.out.println("1) Ajouter un livre");
        System.out.println("2) Supprimer un livre (par ISBN)");
        System.out.println("3) Chercher un livre (par ISBN)");
        System.out.println("4) Chercher des livres (par auteur)");
        System.out.println("5) Chercher des livres (par titre)");
        System.out.println("6) Afficher tous les livres");
        System.out.println("0) Quitter");
    }

     
    }
