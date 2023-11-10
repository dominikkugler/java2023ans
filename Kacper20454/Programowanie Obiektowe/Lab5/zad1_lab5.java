import java.math.BigDecimal;

public class zad1_lab1{
    public static void main(String[] args){
        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.2");
        //Obliczanie sumy liczb BigDecimal
        BigDecimal c = a.add(b);
        System.out.println(c);
        //Obliczanie różnicy liczb BigDecimal
        BigDecimal d = a.subtract(b);
        System.out.println(d);
        //Obliczanie iloczynu liczb BigDecimal
        BigDecimal e = a.multiply(b);
        System.out.println(e);
        //Obliczanie ilorazu liczb BigDecimal
        BigDecimal f = a.divide(b);
        System.out.println(f);
    }
}