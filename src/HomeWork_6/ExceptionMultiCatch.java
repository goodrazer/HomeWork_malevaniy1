package HomeWork_6;

public class ExceptionMultiCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 7, 3};
            System.out.println(numbers[10]);
            int firstElement = numbers[0];
            int result;
            result = firstElement / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
        }
    }
}

