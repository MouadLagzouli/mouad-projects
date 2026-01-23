public class Validation {

    public static boolean estVide(String s) {
        return s == null || s.trim().isEmpty();
    } 

    public static void verifierNonVide(String s, String messageErreur) {
        if (estVide(s)) {
            throw new IllegalArgumentException(messageErreur);
        }
    }

    public static void verifierISBN(String isbn) {
        verifierNonVide(isbn, "ISBN ne doit pas être vide.");
        String x = isbn.trim();

        // règle simple: chiffres uniquement + longueur >= 10
        if (!x.matches("\\d{10,13}")) {
            throw new IllegalArgumentException("ISBN invalide (10 à 13 chiffres attendus).");
        }
    }
}
