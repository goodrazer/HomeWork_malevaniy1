package HomeWork_6;

import java.util.Scanner;

public class ExceptionSeveralCatch {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите делимое (целое положительное число) b =  ");
        int b = scanner.nextInt();
        System.out.println("Введите делитель (целое положительное число) c =  ");
        int c = scanner.nextInt();
        scanner.close();
        if (b < 0 || c < 0) {
            throw new Exception("Вы ввели отрицательно число, необходимо ввести положительное!");
        }
        try {
            int a = b / c;
            System.out.println("Результат расчета по формуле a = b / c = " + a);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка! На ноль делить нельзя! Иди, математику учи, дружище))");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
