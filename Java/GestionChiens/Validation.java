public class Validation {

    public static boolean estVide(String s) {
        return s == null || s.trim().isEmpty();
    }

    public static void verifierNom(String nom) {
        if (estVide(nom)) {
            throw new IllegalArgumentException("Le nom ne doit pas être vide.");
        }
    }

    public static void verifierIndex(int index, int taille) {
        if (index < 0 || index >= taille) {
            throw new IllegalArgumentException("Index invalide.");
        }
    }
}


