import java.util.ArrayList;

public class RechercheLivre {

    public static ArrayList<Livre> parAuteur(Catalogue catalogue, String auteur) {
        ArrayList<Livre> res = new ArrayList<>();
        if (catalogue == null || Validation.estVide(auteur)) return res;

        String a = auteur.trim().toLowerCase();
        for (Livre l : catalogue.getTous()) {
            if (l.getAuteur().toLowerCase().contains(a)) {
                res.add(l);
            }
        }
        return res;
    }

    public static ArrayList<Livre> parTitre(Catalogue catalogue, String titre) {
        ArrayList<Livre> res = new ArrayList<>();
        if (catalogue == null || Validation.estVide(titre)) return res;

        String t = titre.trim().toLowerCase();
        for (Livre l : catalogue.getTous()) {
            if (l.getTitre().toLowerCase().contains(t)) {
                res.add(l);
            }
        }
        return res;
    }
}
