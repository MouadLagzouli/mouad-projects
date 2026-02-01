
public class Validation {

    public static boolean estVide(String s) {
        return s == null || s.trim().isEmpty();
    }
public static void verifierNonVide(String s, String msg) {
        if (estVide(s)) throw new IllegalArgumentException(msg);
    }
