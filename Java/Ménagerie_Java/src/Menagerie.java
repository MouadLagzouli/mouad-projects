public class Menagerie {

    private Animal[] tab;
    private int nbAnimaux;

    public Menagerie(int taille) {
        tab = new Animal[taille];
        nbAnimaux = 0;
    }

    public void ajouter(Animal a) {
        if (nbAnimaux < tab.length) {
            tab[nbAnimaux] = a;
            nbAnimaux++;
        } else {
            System.out.println("La ménagerie est pleine !");
        }
    }

    @Override
    public String toString() {
        String res = "Ménagerie :\n";
        for (int i = 0; i < nbAnimaux; i++) {
            res += "- " + tab[i].toString() + "\n";
        }
        return res;
    }
}
