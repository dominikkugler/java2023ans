import java.util.Scanner;
public class Lab5Zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą nieujemną: ");
        int number = scanner.nextInt();
        System.out.println("Postać binarna liczby " + number + " to: " + toBinary(number));
        scanner.close();
    }

    public static String toBinary(int number) {
        if (number == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.append(number % 2);
            number /= 2;
        }
        return binary.reverse().toString();
    }
}

