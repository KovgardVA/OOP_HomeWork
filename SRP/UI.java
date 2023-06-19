package SRP;

import java.util.Scanner;

public class UI {
    private Scanner scanner = new Scanner(System.in);

    public String getData(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
