package HomeWork_6;

import java.util.Scanner;

public class ExceptionTryCatchFinally {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите делимое (положительное число) b =  ");
        double b = scanner.nextInt();
        System.out.println("Введите делитель (положительное число) c =  ");
        double c = scanner.nextInt();
        scanner.close();
        if (b < 0 || c < 0) {
            throw new Exception("Вы ввели отрицательно число, необходимо ввести положительное!");
        }
        try {
            double a = b / c;
            System.out.println("Результат расчета по формуле a = b / c = " + a);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка! На ноль делить нельзя! Иди, математику учи, дружище)))");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        finally {
            System.out.println("Вычисление проведено успешно!");
        }
    }
}
