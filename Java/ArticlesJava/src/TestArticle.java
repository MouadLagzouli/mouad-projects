public class TestArticle {
    public static void main(String[] args) {

        Stylo s1 = new Stylo("Bic", "Bleu", 2.5);
        Ramette r1 = new Ramette("Clairefontaine", 80, "Blanc", 4.0);

        System.out.println(s1);
        System.out.println("Reference : " + s1.calculeReference());

        System.out.println(r1);
        System.out.println("Reference : " + r1.calculeReference());
    }
}
