import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz tekst:");
        String tekst = scanner.nextLine();

        StringBuilder wynik = new StringBuilder();
        for (char c : tekst.toCharArray()) {
            if (Character.isUpperCase(c)) {
                wynik.append(Character.toLowerCase(c));
            } else {
                wynik.append(Character.toUpperCase(c));
            }
        }

        System.out.println("Wynik: " + wynik.toString());
        scanner.close();
    }
}
