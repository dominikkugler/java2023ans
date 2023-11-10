import java.math.BigDecimal;
import java.math.RoundingMode;

public class Lab5Zad1 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("3.1");
        BigDecimal b = new BigDecimal("2.3");

        BigDecimal suma = a.add(b);
        BigDecimal roznica = a.subtract(b);
        BigDecimal iloczyn = a.multiply(b);
        BigDecimal iloraz = a.divide(b, 2, RoundingMode.HALF_UP);

        System.out.println("Suma: " + suma);
        System.out.println("Roznica: " + roznica);
        System.out.println("Iloczyn: " + iloczyn);
        System.out.println("Iloraz: " + iloraz);
    }
}

