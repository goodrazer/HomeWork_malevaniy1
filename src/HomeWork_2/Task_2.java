package HomeWork_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру за окном:");
        int t = scanner.nextInt();
        if (t > -5){
            System.out.println("Warm");
        }
        else if (t <= -5 && t > -20) {
            System.out.println("Normal");
        }
        else if (t <= -20) {
            System.out.println("Cold");
        }
    }
}

