import java.util.ArrayList;

public class RechercheCompte {

    public static Compte parNumero(Banque banque, String num) {
        if (banque == null || Validation.estVide(num)) return null;
        String x = num.trim();

        for (Compte c : banque.getComptes()) {
            if (c.getNumCompte().equalsIgnoreCase(x)) return c;
        }
        return null;
    }

    public static ArrayList<Compte> parNom(Banque banque, String nom) {
        ArrayList<Compte> res = new ArrayList<>();
        if (banque == null || Validation.estVide(nom)) return res;

        String n = nom.trim().toLowerCase();
        for (Compte c : banque.getComptes()) {
            if (c.getNom().toLowerCase().contains(n)) res.add(c);
        }
        return res;
    }
}
