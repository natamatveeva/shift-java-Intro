package main.java.homework22;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a1 = scanner.nextInt();
        System.out.print("Введите последнее число: ");
        int a2 = scanner.nextInt();
        System.out.print("Введите шаг: ");
        int k = scanner.nextInt();
        int[][] multiTable = new int[6][6];
        int b1 = a1;
        for (int i = 1; i < 6; i++) {
            multiTable[0][i] = b1;
            b1 += k;
            if (i == 5) {
                multiTable[0][i] = a2;
            }
        }
        System.out.println();
        int b2 = a1;
        for (int i = 1; i < 6; i++) {
            multiTable[i][0] = b2;
            b2 += k;
            if (i == 5) {
                multiTable[i][0] = a2;
            }
        }
        for (int i = 0; i < 5; i++) {
            int c1 = multiTable[i+1][0];
            for (int j = 0; j < 5; j++) {
                multiTable[i+1][j+1] = multiTable[0][j+1]*c1;
            }
        }
        printTable(multiTable);

    }

    public static void printTable(int arr[][]) {
        int width = getCellWidth(5*5);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.printf("%5d",arr[i][j] );
            }
            System.out.println();
        }
    }

    public static int getCellWidth(int number) {
        String data = String.valueOf(number);
        return data.length();
    }
}
