public class Personnel {
    public Employe[] tab;
    public int nb;

    public Personnel() {
        tab = new Employe[200];
        nb = 0;
    }

    public void ajouterEmploye(Employe e) {
        if (nb < tab.length) {
            tab[nb++] = e;
        } else {
            System.out.println("Impossible d'ajouter : tableau plein !");
        }
    }

    public void afficherSalaires() {
        for (int i = 0; i < nb; i++) {
            System.out.println(tab[i].getNom() + " gagne " + tab[i].calculerSalaire() + " DH.");
        }
    }

    public double salaireMoyen() {
        double somme = 0;
        for (int i = 0; i < nb; i++)
            somme += tab[i].calculerSalaire();
        return somme / nb;
    }
}
