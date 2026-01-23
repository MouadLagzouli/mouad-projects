public class Livre implements Affichable, Identifiable {
    private String titre;
    private String auteur;
    private String isbn;

    public Livre(String titre, String auteur, String isbn) {
        Validation.verifierNonVide(titre, "Le titre ne doit pas être vide.");
        Validation.verifierNonVide(auteur, "L'auteur ne doit pas être vide.");
        Validation.verifierISBN(isbn);

        this.titre = titre.trim();
        this.auteur = auteur.trim();
        this.isbn = isbn.trim();
    }

    public String getTitre() { return titre; }
    public void setTitre(String titre) {
        Validation.verifierNonVide(titre, "Le titre ne doit pas être vide.");
        this.titre = titre.trim();
    }

    public String getAuteur() { return auteur; }
    public void setAuteur(String auteur) {
        Validation.verifierNonVide(auteur, "L'auteur ne doit pas être vide.");
        this.auteur = auteur.trim();
    }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) {
        Validation.verifierISBN(isbn);
        this.isbn = isbn.trim();
    }

    @Override
    public String getId() {
        return isbn;
    }

    @Override
    public String afficher() {
        return "Livre: " + titre + " | Auteur: " + auteur + " | ISBN: " + isbn;
    }
}
