public abstract class AnimalAPattes extends Animal {
    protected int nbPattes;

    public AnimalAPattes(String nom, int age, int nbPattes) {
        super(nom, age);
        this.nbPattes = nbPattes;
    }

    @Override
    public String toString() {
        return super.toString() + ", pattes : " + nbPattes;
    }
}
