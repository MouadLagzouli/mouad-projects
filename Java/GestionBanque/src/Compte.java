
import java.util.ArrayList;

public class Compte implements Affichable {
    private String nom;
    private String numCompte;
    private double solde;
    private ArrayList<Transaction> historique;
 public Compte(String nom, String numCompte, double soldeInitial) {
        Validation.verifierNonVide(nom, "Le nom ne doit pas être vide.");
        Validation.verifierNonVide(numCompte, "Le numéro de compte ne doit pas être vide.");

        this.nom = nom.trim();
        this.numCompte = numCompte.trim();
        this.solde = soldeInitial;
        this.historique = new ArrayList<>();
    }
