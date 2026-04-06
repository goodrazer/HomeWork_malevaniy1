package HomeWork_7_StringProcessing;

import java.util.Scanner;

public class Task_2 {
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
        String dummyVariable;
        if (firstString.length() > secondString.length()) {
            dummyVariable = firstString; firstString = secondString; secondString = dummyVariable;
        }
        if (secondString.length() > thirdString.length()) {
            dummyVariable = secondString; secondString = thirdString; thirdString = dummyVariable;
        }
        if (firstString.length() > secondString.length()) {
            dummyVariable = firstString; firstString = secondString; secondString = dummyVariable;
        }
        System.out.println("Строки отсортированы по количеству символов в порядке возрастания:");
        System.out.println(firstString);
        System.out.println(secondString);
        System.out.println(thirdString);
    }
}
