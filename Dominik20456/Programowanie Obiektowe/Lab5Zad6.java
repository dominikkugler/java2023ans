import java.util.Scanner;
public class Lab5Zad6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę ujemną: ");
        int number = scanner.nextInt();
        scanner.close();

        int result1 = number >> 2;
        int result2 = number >>> 2;

        System.out.println("Wynik przesunięcia o 2 bity w prawo (>>): " + result1);
        System.out.println("Wynik przesunięcia o 2 bity w prawo bez znaku (>>>): " + result2);
    }
}


