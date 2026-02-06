import java.util.ArrayList;
import java.util.Scanner;

public class MenuConsole {
    private Banque banque;
    private Scanner sc;

    public MenuConsole() {
        banque = new Banque();
        sc = new Scanner(System.in);
    }
