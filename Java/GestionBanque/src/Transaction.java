
public class Transaction implements Affichable {
    private TypeTransaction type;
    private double montant;
public Transaction(TypeTransaction type, double montant) {
        this.type = type;
        this.montant = montant;
    }

    public TypeTransaction getType() { return type; }
    public double getMontant() { return montant; }

    @Override
    public String afficher() {
        return "Transaction: " + type + " | Montant: " + montant;
    }
}
