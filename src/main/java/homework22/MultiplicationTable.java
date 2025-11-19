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
        int arrLenght = lenghtCalc(start, end, step) + 1;
        System.out.println(arrLenght);
        int[][] multiTable = new int[arrLenght][arrLenght];
        int startCopy1 = start;
        for (int i = 1; i < multiTable.length; i++) {
            multiTable[0][i] = startCopy1;
            startCopy1 += step;
            if (i == (multiTable.length - 1)) {
                multiTable[0][i] = end;
            }
        }
        System.out.println();
        int startCopy2 = start;
        for (int i = 1; i < multiTable.length; i++) {
            multiTable[i][0] = startCopy2;
            startCopy2 += step;
            if (i == (multiTable.length - 1)) {
                multiTable[i][0] = end;
            }
        }
        for (int i = 1; i < (multiTable.length); i++) {
            int multiplier = multiTable[i][0];
            for (int j = 1; j < (multiTable.length); j++) {
                multiTable[i][j] = multiTable[0][j]*multiplier;
            }
        }
        printTable(multiTable);

    }

    public static void printTable(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%5d",arr[i][j] );
            }
            System.out.println();
        }
    }
    public static int lenghtCalc(int start, int end, int step) {
        int counter = 1;
        if (start <= end) {
            while (start < end) {
                start += step;
                counter++;
            }
        }
        return counter;
    }
}
