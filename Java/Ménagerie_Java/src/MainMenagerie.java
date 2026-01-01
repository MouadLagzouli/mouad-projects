public class MainMenagerie {
    public static void main(String[] args) {

        Menagerie m = new Menagerie(10);

        Animal v1 = new Vache("Marguerite", 5);
        Animal v2 = new Vache("Blanchette", 3);
        Animal b1 = new Boa("Kaa", 2);

        m.ajouter(v1);
        m.ajouter(v2);
        m.ajouter(b1);

        System.out.println(m);

        v1.crier();
        b1.crier();
    }
}
