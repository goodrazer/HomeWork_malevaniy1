package HomeWork_2;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Введите целое число:");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Введеное число четное");
        }
        else {
            System.out.println( "Введеное число не четное");
        }
    }
}

