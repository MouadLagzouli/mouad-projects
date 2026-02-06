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
public void retirer(String numCompte, double montant) {
        Compte c = RechercheCompte.parNumero(this, numCompte);
        if (c == null) throw new IllegalArgumentException("Compte introuvable.");
        c.retirer(montant);
    }

    public ArrayList<Compte> getComptes() {
        return comptes;
    }    
public void afficherComptes() {
        if (comptes.isEmpty()) {
            System.out.println("Aucun compte dans la banque.");
            return;
        }
        for (int i = 0; i < comptes.size(); i++) {
            System.out.println((i + 1) + ") " + comptes.get(i).afficher());
        }
    }
}
