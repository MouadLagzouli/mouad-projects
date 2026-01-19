public class ChienUtils {

    public static void afficherChien(Chien c) {
        System.out.println(c.afficher());
    }

    public static void modifierChien(Chien c, String nouveauNom, RaceChien nouvelleRace) {
        c.setNom(nouveauNom);
        c.setRace(nouvelleRace);
    }
}
