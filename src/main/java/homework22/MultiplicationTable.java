package main.java.homework22;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int start = scanner.nextInt();
        System.out.print("Введите последнее число: ");
        int end = scanner.nextInt();
        System.out.print("Введите шаг: ");
        int step = scanner.nextInt();
        int[][] multiTable = new int[6][6];
        System.out.println(multiTable.length);
        int startCopy1 = start;
        for (int i = 1; i < 6; i++) {
            multiTable[0][i] = startCopy1;
            startCopy1 += step;
            if (i == 5) {
                multiTable[0][i] = end;
            }
        }
        System.out.println();
        int startCopy2 = start;
        for (int i = 1; i < 6; i++) {
            multiTable[i][0] = startCopy2;
            startCopy2 += step;
            if (i == 5) {
                multiTable[i][0] = end;
            }
        }
        for (int i = 1; i < 5; i++) {
            int multiplier = multiTable[i][0];
            for (int j = 1; j < 5; j++) {
                multiTable[i][j] = multiTable[0][j]*multiplier;
            }
        }
        printTable(multiTable);

    }

    public static void printTable(int arr[][]) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("%5d",arr[i][j] );
            }
            System.out.println();
        }
    }
}
