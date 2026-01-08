public class Nombre {

    private int valeur;

    public Nombre(int valeur) {
        this.valeur = valeur;
    }

    public boolean estPair() {
        return valeur % 2 == 0;
    }

    public int getValeur() {
        return valeur;
    }
}
