import java.util.Scanner;
public class Lab5Zad5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int p = -1;
        do {
            System.out.print("Podaj wartość p (liczba nieujemna): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Podaj wartość p (liczba nieujemna): ");
                scanner.next();
            }
            p = scanner.nextInt();
        } while (p < 0);

        System.out.print("Podaj wartość n (liczba nieujemna): ");
        int n = -1;
        do {
            while (!scanner.hasNextInt()) {
                System.out.print("Podaj wartość n (liczba nieujemna): ");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n < 0);

        scanner.close();

        int value = valueOfGroup(n, p);
        System.out.println("Wartość grupy " + n + "-bitów począwszy od pozycji " + p + " wynosi: " + value);
    }

    public static int valueOfGroup(int n, int p) {
        int mask = (1 << n) - 1;
        return mask << p;
    }
}
