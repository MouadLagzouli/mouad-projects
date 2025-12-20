public abstract class Employe {
    public String prenom;
    public String nom;
    public int age;
    public String dateEntree;

    public Employe(String prenom, String nom, int age, String dateEntree) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.dateEntree = dateEntree;
    }

    public abstract double calculerSalaire();

    public String getNom() {
        return "L'employé :  " + prenom + " " + nom;
    }
}
