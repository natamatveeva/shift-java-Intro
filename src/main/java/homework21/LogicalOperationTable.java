package main.java.homework21;

public class LogicalOperationTable {
    public static void main(String[] args) {
        boolean P = false, Q = false;
        System.out.println("P\t\tQ\t\tP AND Q\tP OR Q\tP XOR Q\tNOT P");
        System.out.println(P + "\t" + Q + "\t" + (P & Q) + "\t" + (P | Q) + "\t" + (P ^ Q) + "\t" + (!P));
        P = true;
        Q = false;
        System.out.println(P + "\t" + Q + "\t" + (P & Q) + "\t" + (P | Q) + "\t" + (P ^ Q) + "\t" + (!P));
        P = false;
        Q = true;
        System.out.println(P + "\t" + Q + "\t" + (P & Q) + "\t" + (P | Q) + "\t" + (P ^ Q) + "\t" + (!P));
        P = true;
        Q = true;
        System.out.println(P + "\t" + Q + "\t" + (P & Q) + "\t" + (P | Q) + "\t" + (P ^ Q) + "\t" + (!P));
    }
}
