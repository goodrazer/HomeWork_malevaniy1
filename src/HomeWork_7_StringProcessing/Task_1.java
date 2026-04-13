package HomeWork_7_StringProcessing;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scannerInputString = new Scanner(System.in);
        String[] lines = new String[3];
        System.out.println("Введите 3 строки через клавишу 'Enter':");
        for (int i = 0; i < 3; i++) {
            lines[i] = scannerInputString.nextLine();
        }
        scannerInputString.close();
        String minString = lines[0];
        String maxString = lines[0];
        for (int i = 1; i < lines.length; i++) {
            if (lines[i].length() < minString.length()) {
                minString = lines[i];
            }
            if (lines[i].length() > maxString.length()) {
                maxString = lines[i];
            }
        }
        System.out.println("Самая короткая строка: '" + minString + "' (длина состовляет: " + minString.length() + ").");
        System.out.println("Самая длинная строка: '" + maxString + "' (длина состовляет: " + maxString.length() + ").");
    }

}