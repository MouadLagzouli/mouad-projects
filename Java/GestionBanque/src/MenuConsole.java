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
                default: System.out.println("Choix invalide.");        }
            
System.out.println();
        } while (choix != 0);
    }

    private void afficherMenu() {
        System.out.println("==== MENU BANQUE ====");
        System.out.println("1) Créer un compte");
        System.out.println("2) Supprimer un compte (par numéro)");
        System.out.println("3) Déposer");
        System.out.println("4) Retirer");
        System.out.println("5) Chercher un compte (par numéro)");
        System.out.println("6) Chercher des comptes (par nom)");
        System.out.println("7) Afficher tous les comptes");
        System.out.println("8) Afficher historique d’un compte");
        System.out.println("0) Quitter");        }

 private void creerCompte() {
        try {
            System.out.print("Nom: ");
            String nom = sc.nextLine();

            System.out.print("Numéro de compte: ");
            String num = sc.nextLine();      
   double solde = lireDouble("Solde initial: ");

            Compte c = new Compte(nom, num, solde);
            boolean ok = banque.ajouterCompte(c);

            if (ok) System.out.println("Compte créé ");
            else System.out.println("Création refusée (numéro déjà existant).");
        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }    
private void supprimerCompte(){
        try {
            System.out.print("Numéro à supprimer: ");
            String num = sc.nextLine();

            boolean ok = banque.supprimerCompteParNumero(num);
            if (ok) System.out.println("Compte supprimé");
            else System.out.println("Compte introuvable.");
        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
private void deposer() {
        try {
            System.out.print("Numéro de compte: ");
            String num = sc.nextLine();
            double montant = lireDouble("Montant dépôt: ");

            banque.deposer(num, montant);
            System.out.println("Dépôt effectué ");
        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }    
   private void retirer() {
        try {
            System.out.print("Numéro de compte: ");
            String num = sc.nextLine();
            double montant = lireDouble("Montant retrait: ");
              banque.retirer(num, montant);
            System.out.println("Retrait effectué ");
        } catch (Exception e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
 private void chercherParNumero() {
        System.out.print("Numéro: ");
        String num = sc.nextLine();

        Compte c = RechercheCompte.parNumero(banque, num);
        if (c == null) System.out.println("Aucun compte trouvé.");
        else System.out.println("Trouvé  " + c.afficher());
    }
private void chercherParNom() {
        System.out.print("Nom (mot clé): ");
        String nom = sc.nextLine();

        ArrayList<Compte> res = RechercheCompte.parNom(banque, nom);
        if (res.isEmpty()) {
            System.out.println("Aucun compte trouvé.");
         return;
        }
 System.out.println("Résultats:");
        for (Compte c : res) System.out.println("- " + c.afficher());
    }
private void afficherTout() {
        banque.afficherComptes();
    }    

    private void afficherHistorique() {
        System.out.print("Numéro de compte: ");
        String num = sc.nextLine();

        Compte c = RechercheCompte.parNumero(banque, num);
        if (c == null) {
            System.out.println("Compte introuvable.");
                           return;
        }

        if (c.getHistorique().isEmpty()) {
            System.out.println("Aucune transaction pour ce compte.");
            return;
                   }

        System.out.println("Historique de " + c.getNumCompte() + ":");
        for (Transaction t : c.getHistorique()) {
            System.out.println("- " + t.afficher());
        }
    }

private int lireEntier(String msg) {
        while (true){
         try {
                System.out.print(msg);
                return Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Veuillez entrer un nombre valide.");
            }
        }
    }                      
   
