import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab4Zad1{
    public static void main(String[]args){
        double[] x = new double[8];
        read1Tab1D(x);
        printTab1D(x);
        double[] xKopia = Arrays.copyOf(x,x.length);
        double[] xDoubleSize = Arrays.copyOf(x,2*x.length);
        Random rd = new Random();
        fillRandomValues(xDoubleSize);
        printTab1D(xDoubleSize);
    }
    static void printTab1D(double[] x){
        for(int i=0;i<x.length;i++){
            System.out.printf(" %f,",x[i]);

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
}