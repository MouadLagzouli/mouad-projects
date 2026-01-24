import java.util.ArrayList;

public class Catalogue {
    private ArrayList<Livre> livres;

    public Catalogue() {
        livres = new ArrayList<>();
    } 

    public boolean ajouter(Livre livre) {
        if (livre == null) return false;

        // éviter doublon ISBN
        if (chercherParISBN(livre.getIsbn()) != null) return false;

        livres.add(livre);
        return true;
    }

    public boolean supprimerParISBN(String isbn) {
        Validation.verifierISBN(isbn);

        Livre l = chercherParISBN(isbn);
        if (l == null) return false;

        livres.remove(l);
        return true;
    }

    public Livre chercherParISBN(String isbn) {
        if (Validation.estVide(isbn)) return null;
        String x = isbn.trim();

        for (Livre l : livres) {
            if (l.getIsbn().equals(x)) return l;
        }
        return null;
    }

    public ArrayList<Livre> getTous() {
        return livres;
    }

    public int taille() {
        return livres.size();
    }
}
