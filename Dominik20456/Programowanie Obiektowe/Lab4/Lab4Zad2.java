import java.util.Scanner;

public class Lab4Zad2 {
    public static void main(String[] args) {
        double[][] tabX = new double[3][3];

        read1Tab2D(tabX);
        System.out.println("Tablica tabX:");
        printTab2D(tabX);
    }

    public static void read1Tab2D(double y[][]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź elementy tablicy tabX:");

        int numRows = y.length; 
        int numCols = y[0].length;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("tabX[" + i + "][" + j + "]: ");
                y[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();
    }

    public static void printTab2D(double y[][]) {
        int numRows = y.length; 
        int numCols = y[0].length; 

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(y[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
