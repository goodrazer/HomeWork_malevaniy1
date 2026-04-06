package HomeWork_7_StringProcessing;

import java.util.Scanner;

public class Task_3 {
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
        double averageStringLength = (firstString.length() + secondString.length() + thirdString.length()) / 3.0;
        System.out.println("Средняя длина всех строк: " + averageStringLength);
        System.out.println("Строки, имеющие длину меньше чем средняя длина всех строк:");
        if (firstString.length() < averageStringLength) {
            System.out.println(firstString.concat (" - первая строка."));
            System.out.println("Длина первой строки = " + firstString.length() + ", что меньше средней длины всех строк: " + averageStringLength + "!");
        }
        if (secondString.length() < averageStringLength) {
            System.out.println(secondString.concat (" - вторая строка."));
            System.out.println("Длина второй строки = " + secondString.length() + ", что меньше средней длины всех строк: " + averageStringLength + "!");
        }
        if (thirdString.length() < averageStringLength) {
            System.out.println(thirdString.concat (" - третья строка."));
            System.out.println("Длина третьей строки = " + thirdString.length() + ", что меньше средней длины всех строк: " + averageStringLength + "!");
        }
        else {
            System.out.println("Радкі, якія маюць даўжыню меншую за сярэднюю даўжыню ўсіх радкоў - адсутнічаюць!!!.");
            System.out.println("=)");
        }
    }
}
