public class Boa extends AnimalSansPattes {

    public Boa(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void vieillir() {
        age++;
    }

    @Override
    public void crier() {
        System.out.println("Le boa siffle : Ssssss !");
    }
}
