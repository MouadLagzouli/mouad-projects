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

     
 private void ajouterLivre() {
        try {
            System.out.print("Titre: ");
            String titre = sc.nextLine();

            System.out.print("Auteur: ");
            String auteur = sc.nextLine();

            System.out.print("ISBN (10-13 chiffres): ");
            String isbn = sc.nextLine();

            Livre livre = new Livre(titre, auteur, isbn);
            boolean ok = catalogue.ajouter(livre);
            f (ok) System.out.println("Livre ajouté ✅");
            else System.out.println("Ajout refusé (ISBN déjà existant ou livre invalide).");
        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }

    private void supprimerLivre() {
        try {
            System.out.print("ISBN à supprimer: ");
            String isbn = sc.nextLine();

            boolean ok = catalogue.supprimerParISBN(isbn);
            if (ok) System.out.println("Livre supprimé ✅");
            else System.out.println("Aucun livre trouvé avec cet ISBN.");
        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }

