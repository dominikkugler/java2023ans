import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab4Zad1 {
    public static void main(String[] args) {
        double[] x = new double[8];

        read1Tab1D(x);
        System.out.println("Tablica x:");
        printTab1D(x); 

        double[] xKopia = Arrays.copyOf(x, x.length);
        System.out.println("\nKopia tablicy x:");
        printTab1D(xKopia);

        double[] xDoubleSize = new double[x.length * 2]; 
        fillRandomValues(xDoubleSize);
        System.out.println("\nTablica xDoubleSize (powiększona dwukrotnie):");
        printTab1D(xDoubleSize);

        int[] z = new int[4]; 
        int startIndex = 2; 
        int endIndex = 5;
        copyToZ(x, z, startIndex, endIndex);
        System.out.println("\nTablica z (skopiowana z x):");
        printTab1D(z);
    }

    public static void read1Tab1D(double x[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź " + x.length + " elementów tablicy x:");
        for (int i = 0; i < x.length; i++) {
            x[i] = scanner.nextDouble();
        }
        scanner.close();
    }

    public static void printTab1D(double x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    public static void printTab1D(int x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    public static void fillRandomValues(double x[]) {
        Random rand = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = rand.nextDouble();
        }
    }

    public static void copyToZ(double source[], int dest[], int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex >= source.length || startIndex > endIndex || dest.length < (endIndex - startIndex + 1)) {
            System.out.println("Nieprawidłowy zakres lub rozmiar tablicy docelowej.");
            return;
        }

        for (int i = 0; i <= endIndex - startIndex; i++) {
            dest[i] = (int) source[startIndex + i];
        }
    }
}
