public class SallePleineException extends Exception {

    public Spectateur spectateur;

    public SallePleineException(String message, Spectateur spectateur) {
        super(message);
        this.spectateur = spectateur;
    }

    public Spectateur getSpectateur() {
        return spectateur;
    }
}
