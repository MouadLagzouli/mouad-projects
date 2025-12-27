import java.util.ArrayList;

public class Cinema {

    public int capaciteSalle;
    public ArrayList<Salle> salles;

    public Cinema(int capaciteSalle) {
        this.capaciteSalle = capaciteSalle;
        this.salles = new ArrayList<>();
        salles.add(new Salle(capaciteSalle));
    }

    public Salle placer(Spectateur s) {
        Salle derniere = salles.get(salles.size() - 1);

        try {
            derniere.ajouterSpectateur(s);
        } catch (SallePleineException e) {

            Salle nouvelleSalle = new Salle(capaciteSalle);
            salles.add(nouvelleSalle);

            try {
                nouvelleSalle.ajouterSpectateur(s);
            } catch (SallePleineException ex) {
                System.out.println("Erreur inattendue !");
            }

            return nouvelleSalle;
        }

        return derniere;
    }

    @Override
    public String toString() {
        return "Cinema avec " + salles.size() + " salles.";
    }
}
