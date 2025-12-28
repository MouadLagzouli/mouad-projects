public class Spectateur {
    public String nom;

    public Spectateur(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Spectateur : " + nom;
    }
}
