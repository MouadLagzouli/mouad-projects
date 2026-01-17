public class TestSports {
    public static void main(String[] args) {

        Sports sport = new Sports();
        Sports football = new Football();
        Sports basketball = new Basketball();
        Sports rugby = new Rugby();

        System.out.println("=== Démonstration ===");
        sport.play();
        football.play();
        basketball.play();
        rugby.play();
    }
}
