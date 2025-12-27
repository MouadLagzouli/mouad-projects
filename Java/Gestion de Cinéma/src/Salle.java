import java.util.ArrayList;

public class Salle {

    public int capacite;
    public ArrayList<Spectateur> spectateurs;

    public Salle(int capacite) {
        this.capacite = capacite;
        this.spectateurs = new ArrayList<>();
    }

    public int getCapacite() {
        return capacite;
    }

    public void ajouterSpectateur(Spectateur s) throws SallePleineException {
        if (spectateurs.size() >= capacite) {
            throw new SallePleineException("Salle pleine !", s);
        }
        spectateurs.add(s);
    }

    @Override
    public String toString() {
        return "Salle (capacite : " + capacite + ", presents : " + spectateurs.size() + ")";
    }
}
