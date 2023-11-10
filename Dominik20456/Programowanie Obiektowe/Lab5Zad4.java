
public class Lab5Zad4 {
    public static void main(String[] args) {
        int mask0 = 0;
        int p = 4;
        
        // a) ustawienie określonego bitu w słowie binarnym na 0
        int bitToClear = 2;
        int clearMask = ~(1 << bitToClear);
        int resultA = mask0 & clearMask;
        System.out.println("a) " + String.format("%16s", Integer.toBinaryString(resultA)).replace(' ', '0'));
        
        // b) ustawienie określonego bitu w słowie binarnym na 1
        int bitToSet = 5;
        int setMask = 1 << bitToSet;
        int resultB = mask0 | setMask;
        System.out.println("b) " + String.format("%16s", Integer.toBinaryString(resultB)).replace(' ', '0'));
        
        // c) tworzący maskę p-bitową na najmłodszych pozycjach złożoną z samych zer
        int resultC = (1 << p) - 1;
        System.out.println("c) " + String.format("%16s", Integer.toBinaryString(resultC)).replace(' ', '0'));
        
        // d) tworzący maskę p-bitową na najmłodszych pozycjach złożoną z samych jedynek
        int resultD = (1 << p) - 1 << (16 - p);
        System.out.println("d) " + String.format("%16s", Integer.toBinaryString(resultD)).replace(' ', '0'));
        
        // e) tworzący maskę p-bitową na najstarszych pozycjach złożoną z samych zer
        int resultE = ~0 << p;
        System.out.println("e) " + String.format("%16s", Integer.toBinaryString(resultE)).replace(' ', '0'));
        
        // f) tworzący maskę p-bitową na najstarszych pozycjach złożoną z samych jedynek
        int resultF = ~0 << p << (16 - p);
        System.out.println("f) " + String.format("%16s", Integer.toBinaryString(resultF)).replace(' ', '0'));
    }
}
