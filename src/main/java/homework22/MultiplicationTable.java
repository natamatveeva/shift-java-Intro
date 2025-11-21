package main.java.homework22;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int start = 0, end = 0, step = 0;
        start = validateEnter("Введите первое число: ");
        end = validateEnter("Введите последнее число: ");
        step = validateEnter("Введите шаг: ");
        int arrLenght = getArraySize(start, end, step) + 1;
        int[][] multiplicationTable = new int[arrLenght][arrLenght];
        int startCopy1 = start;
        for (int i = 1; i < multiplicationTable.length; i++) {
            multiplicationTable[0][i] = startCopy1;
            startCopy1 += step;
            if (i == (multiplicationTable.length - 1)) {
                multiplicationTable[0][i] = end;
            }
        }
        int startCopy2 = start;
        for (int i = 1; i < multiplicationTable.length; i++) {
            multiplicationTable[i][0] = startCopy2;
            startCopy2 += step;
            if (i == (multiplicationTable.length - 1)) {
                multiTable[i][0] = end;
            }
        }
        for (int i = 1; i < (multiplicationTable.length); i++) {
            int multiplier = multiplicationTable[i][0];
            for (int j = 1; j < (multiplicationTable.length); j++) {
                multiplicationTable[i][j] = multiplicationTable[0][j]*multiplier;
            }
        }
        printTable(multiTable);

    }

    public static void printTable(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%5d",arr[i][j] );
            }
            System.out.println();
        }
    }
    public static int getArraySize(int start, int end, int step) {
        int counter = 1;
        if (start <= end) {
            while (start < end) {
                start += step;
                counter++;
            }
        }
        return counter;
    }
    public static int validateEnter(String msg) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        boolean isInt = false;
        while (!isInt) {
            System.out.print(msg);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                isInt = true;
            }
            else {
                System.out.println("Неверный ввод");
                scanner.next();
            }
        }
        return number;
    }
}
