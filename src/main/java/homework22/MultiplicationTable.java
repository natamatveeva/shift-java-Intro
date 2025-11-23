package main.java.homework22;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int start = 0, end = 0, step = 0;
        start = validateEnter("Введите первое число: ");
        end = validateEnter("Введите последнее число: ");
        step = validateEnter("Введите шаг: ");
        int arrayLenght = getArraySize(start, end, step) + 1;
        int[][] multiplicationTable = new int[arrayLenght][arrayLenght];
        int multiplier = start;
        for (int i = 1; i < multiplicationTable.length; i++) {
            multiplicationTable[0][i] = multiplier;
            multiplier += step;
            if (i == (multiplicationTable.length - 1)) {
                multiplicationTable[0][i] = end;
            }
        }
        multiplier = start;
        for (int i = 1; i < multiplicationTable.length; i++) {
            multiplicationTable[i][0] = multiplier;
            multiplier += step;
            if (i == (multiplicationTable.length - 1)) {
                multiplicationTable[i][0] = end;
            }
        }
        for (int i = 1; i < (multiplicationTable.length); i++) {
            multiplier = multiplicationTable[i][0];
            for (int j = 1; j < (multiplicationTable.length); j++) {
                multiplicationTable[i][j] = multiplicationTable[0][j]*multiplier;
            }
        }
        printTable(multiplicationTable, start, end);
        String fileName = "output.txt";
        FileOutputStream fileOutputStream = null;
        char[] characters;

        try {
            // Открыть файл
            fileOutputStream = new FileOutputStream(fileName);

            // Записать в файл
            for (char character : characters) {
                fileOutputStream.write(character);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла");
        } finally {
            // Закрыть файл
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии файла");
            }
        }
    }

    public static void printTable(int[][] array, int start, int end) {
        int width = getCellWidth(start * end * 100);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("%" + width + "d",array[i][j] );
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
    public static int getCellWidth(int number) {
        String data = String.valueOf(number);
        return data.length();
    }
}
