public class Animal implements Affichable {
    protected String nom;

    public Animal(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String afficher() {
        return "Animal: " + nom;
    }
}
