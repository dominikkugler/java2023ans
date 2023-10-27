import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab4Zad1{
    public static void main(String[]args){
        double[] x = new double[8];
        read1Tab1D(x);
        printTab1D(x);

        double[] xKopia = Arrays.copyOf(x,x.length);
        printTab1D(xKopia);

        double[] xDoubleSize = Arrays.copyOf(x,2*x.length);
        fillRandomValues(xDoubleSize);
        printTab1D(xDoubleSize);

        int[] z = new int[x.length];
        copyOfRange(x,z,2,5);
        printTab1DI(z);
    }
    static void printTab1D(double[] x){
        for(int i=0;i<x.length;i++){
            System.out.printf(" %f,",x[i]);

        }
    }
    static void printTab1DI(int[] x){
        for(int i=0;i<x.length;i++){
            System.out.printf(" %d,",x[i]);

        }
    }
    static void read1Tab1D(double x[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<x.length;i++){
            System.out.printf("Podaj x[%d]:",i);
            while(!sc.hasNextDouble()){
                System.out.println("Nieprawidlowa liczba");
                System.out.println("Podaj prawidlowa liczbe");

                sc.next();
            }
            x[i] = sc.nextDouble();

        }
        sc.close();
    }
    public static void fillRandomValues(double x[]) {
        Random rand = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = rand.nextDouble();
        }
    }
    public static void copyOfRange(double source[], int dest[], int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex >= source.length || startIndex > endIndex || dest.length < (endIndex - startIndex + 1)) {
            System.out.println("Nieprawidłowy zakres lub rozmiar tablicy docelowej.");
            return;
        }

        for (int i = 0; i <= endIndex - startIndex; i++) {
            dest[i] = (int) source[startIndex + i];
        }
    }
}
