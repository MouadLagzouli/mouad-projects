import java.util.ArrayList;

public class Banque {
    private ArrayList<Compte> comptes;

    public Banque() {
        comptes = new ArrayList<>();
    }
 public boolean ajouterCompte(Compte compte) {
        if (compte == null) return false;

        // éviter doublon numéro
        if (RechercheCompte.parNumero(this, compte.getNumCompte()) != null) return false;

        comptes.add(compte);
        return true;
    }
 public boolean supprimerCompteParNumero(String numCompte) {
        Validation.verifierNonVide(numCompte, "Numéro de compte vide.");

        Compte c = RechercheCompte.parNumero(this, numCompte);
        if (c == null) return false;

        comptes.remove(c);
        return true;
    }
 public void deposer(String numCompte, double montant) {
        Compte c = RechercheCompte.parNumero(this, numCompte);
        if (c == null) throw new IllegalArgumentException("Compte introuvable.");
        c.deposer(montant);
    }
