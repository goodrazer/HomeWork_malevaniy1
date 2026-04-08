package HomeWork_6;

import java.util.Scanner;

public class ExceptionsTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           System.out.println("Введите делимое (целое число) b =  ");
           int b = scanner.nextInt();
           System.out.println("Введите делитель (целое число) c =  ");
           int c = scanner.nextInt();
        scanner.close();
        try {
            int a = b / c;
            System.out.println("Результат расчета по формуле a = b / c = " + a);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка! На ноль делить нельзя! Иди, математику учи, дружище)))");
        }
    }
}
