import java.util.Arrays;
import java.util.Scanner;

public class zad1{
    public static void main(String[]args){
        double[] x = new double[8];
        read1Tab1D(x);
        printTab1D(x);
        double[] xKopia = Arrays.copyOf(x,x.length);
        
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
}