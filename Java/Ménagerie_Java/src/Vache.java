public class Vache extends AnimalAPattes {

    public Vache(String nom, int age) {
        super(nom, age, 4);
    }

    @Override
    public void vieillir() {
        age++;
    }

    @Override
    public void crier() {
        System.out.println("La vache meugle : Meuuuh !");
    }
}
