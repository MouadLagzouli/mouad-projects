public class MainVille {

    public static void main(String[] args) {

        Ville v1 = new Ville("Fes", 350000);
        Capitale c1 = new Capitale("Rabat", "Maroc", 580000);
        Patelin p1 = new Patelin("PetitDouar", 1500); 

        System.out.println("=== Descriptions ===");
        v1.description();
        c1.description();
        p1.description();

        System.out.println("\n=== toString() ===");
        System.out.println(v1);
        System.out.println(c1);
        System.out.println(p1);

        System.out.println("\n=== Catégories ===");
        System.out.println(v1.getNom() + " -> catégorie : " + v1.categorie());
        System.out.println(c1.getNom() + " -> catégorie : " + c1.categorie());
        System.out.println(p1.getNom() + " -> catégorie : " + p1.categorie());

        System.out.println("\n=== Polymorphisme ===");
        Ville[] villes = { v1, c1, p1 };
        for (Ville v : villes) {
            v.description();
        }
    }
}
