package HomeWork_7_StringProcessing;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
           System.out.println("Введите первую строку:");
           String firstString = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
           System.out.println("Введите вторую строку:");
           String secondString = scanner2.nextLine();
        Scanner scanner3 = new Scanner(System.in);
           System.out.println("Введите третью строку:");
           String thirdString = scanner3.nextLine();
        scanner1.close();
        scanner2.close();
        scanner3.close();
        int numberOfCharactersTheFirstLine = firstString.length();
        int numberOfCharactersTheSecondLine = secondString.length();
        int numberOfCharactersTheThirdLine = thirdString.length();
        if (numberOfCharactersTheFirstLine > numberOfCharactersTheSecondLine & numberOfCharactersTheFirstLine > numberOfCharactersTheThirdLine) {
            System.out.println("Первая строка самая длинная!");
            System.out.println("Строка содержит: " + firstString.length() + " символов.");
        }
        else if (numberOfCharactersTheSecondLine > numberOfCharactersTheFirstLine & numberOfCharactersTheSecondLine > numberOfCharactersTheThirdLine) {
            System.out.println("Вторая строка самая длинная!");
            System.out.println("Строка содержит: " + secondString.length() + " символов.");
        }
        else {
            System.out.println("Третья строка самая длинная!");
            System.out.println("Строка содержит: " + thirdString.length() + " символов.");
        }

    }
}
