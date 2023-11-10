public class Lab5Zad2 {
    public static void main(String[] args) {
        short lanbit1 = 12;
        short lanbit2 = -35;

        // a) ~lanbit1 -13
        short a = (short) ~lanbit1;
        System.out.println("a) " + a); // -13

        // b) ~lanbit2 34
        short b = (short) ~lanbit2;
        System.out.println("b) " + b); // 34

        // c) lanbit1&lanbit2 12
        short c = (short) (lanbit1 & lanbit2);
        System.out.println("c) " + c); // 12

        // d) ~lanbit1&lanbit2 -47
        short d = (short) (~lanbit1 & lanbit2);
        System.out.println("d) " + d); // -47

        // e) ~(lanbit1&lanbit2) 13
        short e = (short) ~(lanbit1 & lanbit2);
        System.out.println("e) " + e); // 13

        // f) lanbit1| lanbit2 -35
        short f = (short) (lanbit1 | lanbit2);
        System.out.println("f) " + f); // -35

        // g) ~(lanbit1|lanbit2) 34
        short g = (short) ~(lanbit1 | lanbit2);
        System.out.println("g) " + g); // 34

        // h) (~lanbit1|lanbit2) ….
        short h = (short) (~lanbit1 | lanbit2);
        System.out.println("h) " + h); // -23

        // i) lanbit1^lanbit2 -47
        short i = (short) (lanbit1 ^ lanbit2);
        System.out.println("i) " + i); // -47

        // j) ~(lanbit1^lanbit2) 46
        short j = (short) ~(lanbit1 ^ lanbit2);
        System.out.println("j) " + j); // 46
    }
}

