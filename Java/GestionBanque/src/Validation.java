
public class Validation {

    public static boolean estVide(String s) {
        return s == null || s.trim().isEmpty();
    }
public static void verifierNonVide(String s, String msg) {
        if (estVide(s)) throw new IllegalArgumentException(msg);
    }
 public static void verifierMontantPositif(double montant) {
        if (montant <= 0) throw new IllegalArgumentException("Le montant doit être > 0.");
    }
public static void verifierSoldeSuffisant(double solde, double montant) {
        if (montant > solde) throw new IllegalArgumentException("Solde insuffisant.");
    }
}
    
