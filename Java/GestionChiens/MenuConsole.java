 import java.util.ArrayList;
import java.util.Scanner;

public class MenuConsole {
    private Chenil chenil;
    private Scanner sc;

    public MenuConsole() {
        chenil = new Chenil();
        sc = new Scanner(System.in);
    }

    public void demarrer() {
        int choix;

        do {
            afficherMenu();
            choix = lireEntier("Votre choix: ");

            switch (choix) {
                case 1:
                    ajouter();
                    break;
                case 2:
                    supprimer();
                    break;
                case 3:
                    chercherParNom();
                    break;
                case 4:
                    chercherParRace();
                    break;
                case 5:
                    chenil.afficherTous();
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide.");
            }

            System.out.println();
        } while (choix != 0);
    }

    private void afficherMenu() {
        System.out.println("==== MENU CHENIL ====");
        System.out.println("1) Ajouter un chien");
        System.out.println("2) Supprimer un chien (par nom)");
        System.out.println("3) Chercher un chien (par nom)");
        System.out.println("4) Chercher des chiens (par race)");
        System.out.println("5) Afficher tous les chiens");
        System.out.println("0) Quitter");
    }

    private void ajouter() {
        System.out.print("Nom du chien: ");
        String nom = sc.nextLine();
        try {
            Validation.verifierNom(nom);
        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
            return;
        }

        RaceChien race = choisirRace();
        if (race == null) {
            System.out.println("Race invalide.");
            return;
        }

        Chien chien = new Chien(nom.trim(), race);
        chenil.ajouterChien(chien);
        System.out.println("Chien ajouté ✅");
    }

    private void supprimer() {
        System.out.print("Nom du chien à supprimer: ");
        String nom = sc.nextLine();

        try {
            boolean ok = chenil.supprimerParNom(nom);
            if (ok) System.out.println("Chien supprimé ✅");
            else System.out.println("Aucun chien trouvé avec ce nom.");
        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }

    private void chercherParNom() {
        System.out.print("Nom du chien à chercher: ");
        String nom = sc.nextLine();

        try {
            Chien c = chenil.chercherParNom(nom);
            if (c == null) System.out.println("Aucun chien trouvé.");
            else System.out.println("Trouvé ✅ -> " + c.afficher());
        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }

    private void chercherParRace() {
        RaceChien race = choisirRace();
        if (race == null) {
            System.out.println("Race invalide.");
            return;
        }

        ArrayList<Chien> list = chenil.chercherParRace(race);
        if (list.isEmpty()) {
            System.out.println("Aucun chien trouvé pour cette race.");
            return;
        }

        System.out.println("Chiens trouvés (" + race + "):");
        for (Chien c : list) {
            System.out.println("- " + c.afficher());
        }
    }

    private RaceChien choisirRace() {
        System.out.println("Choisir la race :");
        RaceChien[] races = RaceChien.values();
        for (int i = 0; i < races.length; i++) {
            System.out.println((i + 1) + ") " + races[i]);
        }

        int choix = lireEntier("Numéro de race: ");
        if (choix < 1 || choix > races.length) return null;

        return races[choix - 1];
    }

    private int lireEntier(String message) {
        while (true) {
            try {
                System.out.print(message);
                String s = sc.nextLine();
                return Integer.parseInt(s.trim());
            } catch (Exception e) {
                System.out.println("Veuillez entrer un nombre valide.");
            }
        }
    }
}
