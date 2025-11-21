package main.java.homework231;

import java.util.Scanner;

public class StringProcessing {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите строку больше одного символа: ");
        String str1 = console.nextLine();
        System.out.print("Введите символ для замены: ");
        String ch1 = console.nextLine();
        String str2 = str1.replaceAll("\\s{2,}", " ");
        if (str1.equals(str2)) {
            System.out.println("В строке нет лишних пробелов.");
            str2 = str1.replace(ch1, " ");
            str2 = str2.replaceAll("\\s{2,}", " ");
            System.out.println("Исходная строка: " + str1);
            System.out.println("Новая строка: " + str2);
            if (str1.equals(str2)) {
                System.out.println("Исходная строка не изменилась");
            }
        } else {
            System.out.println("В строке были лишние пробелы, они удалены.");
            str2 = str1.replace(ch1, " ");
            str2 = str2.replaceAll("\\s{2,}", " ");
            System.out.println("Исходная строка: " + str1);
            System.out.println("Новая строка: " + str2);
        }
    }
}
