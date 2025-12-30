public abstract class Animal {
    protected String nom;
    protected int age;

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public abstract void vieillir();
    public abstract void crier();

    @Override
    public String toString() {
        return "Nom : " + nom + ", âge : " + age;
    }
}
