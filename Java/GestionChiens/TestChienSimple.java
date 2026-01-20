public class TestChien {
    public static void main(String[] args) {

        Chien ch1 = new Chien("Rio", RaceChien.BERGER_ALLEMAND);
        Chien ch2 = new Chien("Rocky", RaceChien.HUSKY);

        System.out.println("=== Avant modification ===");
        ChienUtils.afficherChien(ch1);
        ChienUtils.afficherChien(ch2);

        System.out.println("\n=== Après modification ===");
        ChienUtils.modifierChien(ch1, "Rio", RaceChien.BEAGLE);
        ChienUtils.modifierChien(ch2, "Simba", RaceChien.HUSKY);

        ChienUtils.afficherChien(ch1);
        ChienUtils.afficherChien(ch2);
    }
}
