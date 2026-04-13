package HomeWork_7_StringProcessing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scannerInputStrings = new Scanner(System.in);
        String[] lines = new String[3];
        System.out.println("Введите 3 строки через клавишу 'Enter':");
        for (int i = 0; i < 3; i++) {
            lines[i] = scannerInputStrings.nextLine();
        }
        scannerInputStrings.close();
        Arrays.sort(lines, Comparator.comparingInt(String::length));
        System.out.println("Строки выведены в порядке возрастания длины:");
        for (String string : lines) {
            System.out.println("Строка: '" + string + "' (длина: " + string.length() + "): ");
        }
    }
}

