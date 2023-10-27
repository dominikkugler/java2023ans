import java.util.Arrays;

public class Lab4Zad3 {
    public static void main(String[] args) {
        int[] tab = {5, 2, 8, 1, 7, 4, 6, 3};

        int[] ascendingSorted = sorttab(tab, true);
        int[] descendingSorted = sorttab(tab, false);

        System.out.println("Posortowana niemalejąco tablica:");
        printTab1D(ascendingSorted);

        System.out.println("Posortowana nierosnąco tablica:");
        printTab1D(descendingSorted);

        int elementToFind = 7;
        int index = binarySearch(ascendingSorted, elementToFind);
        if (index != -1) {
            System.out.println("Element " + elementToFind + " znaleziony na indeksie: " + index);
        } else {
            System.out.println("Element " + elementToFind + " nie znaleziony w tablicy.");
        }
    }

    public static int[] sorttab(int x[], boolean ascending) {
        int[] sortedArray = Arrays.copyOf(x, x.length);

        if (ascending) {
            Arrays.sort(sortedArray);
        } else {
            Arrays.sort(sortedArray);
            for (int i = 0; i < sortedArray.length / 2; i++) {
                int temp = sortedArray[i];
                sortedArray[i] = sortedArray[sortedArray.length - 1 - i];
                sortedArray[sortedArray.length - 1 - i] = temp;
            }
        }

        return sortedArray;
    }

    public static void printTab1D(int x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    public static int binarySearch(int x[], int key) {
        int index = Arrays.binarySearch(x, key);
        return index;
    }
}
