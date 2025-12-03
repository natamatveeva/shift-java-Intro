package main.java.homework231;

import java.util.Scanner;

public class StringProcessing {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String strStart = validateEnter("Введите строку больше одного символа: ");
        System.out.print("Введите символ для замены: ");
        String charReplace = console.nextLine();
        String strEnd = strStart.replaceAll("\\s{2,}", " ");
        if (strStart.equals(strEnd)) {
            strTransform("В строке нет лишних пробелов.", strStart, strEnd, charReplace);
            if (strStart.equals(strEnd)) {
                System.out.println("Исходная строка не изменилась");
            }
        } else {
            strTransform("В строке были лишние пробелы, они удалены.", strStart, strEnd, charReplace);
        }
    }

    public static void strTransform(String msg, String strStart, String strEnd, String charReplace) {
        System.out.println(msg);
        strEnd = strStart.replace(charReplace, " ");
        strEnd = strEnd.replaceAll("\\s{2,}", " ");
        System.out.println("Исходная строка: " + strStart);
        System.out.println("Новая строка: " + strEnd);

    }

    public static String validateEnter(String msg) {
        String text = "";
        Scanner scanner = new Scanner(System.in);
        boolean isStrOk = false;
        while (!isStrOk) {
            int counter = 0;
            System.out.print(msg);
            text = scanner.nextLine();
            String[] wrongChar = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
            if (text.length() > 1 && text != null) {
//                isStrOk = true;
                for (int i = 0; i < wrongChar.length; i++) {
                    if (text.contains(wrongChar[i])) {
                        System.out.println("Неверный ввод");
                        counter += 1;
                        continue;
                    }
                }
                if (counter == 0) {
                    isStrOk = true;
                }

            } else {
                System.out.println("Неверный ввод");
                continue;
            }
        }
        return text;
    }
}
