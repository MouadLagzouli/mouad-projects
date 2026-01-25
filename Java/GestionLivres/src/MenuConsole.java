import java.util.ArrayList;
import java.util.Scanner;

public class MenuConsole {
    private Catalogue catalogue;
    private Scanner sc;

    public MenuConsole() {
        catalogue = new Catalogue();
        sc = new Scanner(System.in);
    }
