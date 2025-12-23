public class Salaires {
    public static void main(String[] args) {

        Personnel p = new Personnel();

        p.ajouterEmploye(new Vendeur("Sami", "Business", 45, "1995", 30000));
        p.ajouterEmploye(new Representant("Amine", "Vendtout", 25, "2001", 20000));
        p.ajouterEmploye(new Technicien("Ali", "Bosseur", 28, "1998", 1000));
        p.ajouterEmploye(new Manutentionnaire("Saad", "Stocketout", 32, "1998", 45));
        p.ajouterEmploye(new TechnARisque("Islam", "Flippe", 28, "2000", 1000));
        p.ajouterEmploye(new ManutARisque("Zaid", "Abordage", 30, "2001", 45));

        p.afficherSalaires();
        System.out.println("Le salaire moyen dans l'entreprise est de " + p.salaireMoyen() + " DH");
    }
}
