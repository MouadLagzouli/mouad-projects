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
