package main.java.homework21;

public class LogicalOperationTable {
    public static void main(String[] args) {
        boolean P = false, Q = false;
        System.out.println("P\t\tQ\t\tP AND Q\tP OR Q\tP XOR Q\tNOT P");
        System.out.println(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));
        p = true;
        q = false;
        System.out.println(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));
        p = false;
        q = true;
        System.out.println(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));
        p = true;
        q = true;
        System.out.println(p + "\t" + q + "\t" + (p & q) + "\t" + (p | q) + "\t" + (p ^ q) + "\t" + (!p));
    }
}
