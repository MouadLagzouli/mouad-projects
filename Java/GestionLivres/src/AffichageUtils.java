import java.util.ArrayList;

public class AffichageUtils {

    public static void afficherListe(ArrayList<Livre> livres) {
        if (livres == null || livres.isEmpty()) {
            System.out.println("Aucun livre à afficher.");
            return;
        }

        for (int i = 0; i < livres.size(); i++) {
            System.out.println((i + 1) + ") " + livres.get(i).afficher());
        }
    }
}
