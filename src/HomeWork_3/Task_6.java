package HomeWork_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива:");
        Scanner scanner = new Scanner(System.in);
        int sizeArrays = scanner.nextInt();
        Random random = new Random();
        int [] ArraysInt = new int [sizeArrays];
        for (int i = 0; i < ArraysInt.length; i++) {
            ArraysInt[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(ArraysInt));
        boolean comparison = true;

        // Начинаем с 1, чтобы сравнить с 0-м элементом
        for (int i = 1; i < ArraysInt.length; i++) {
            if (ArraysInt[i] <= ArraysInt[i - 1]) {
                comparison = false;
                break; // Выходим, если нашли нарушение
            }
        }

        if (comparison == true){
            System.out.println("Массив возрастающий");
        }
        else {System.out.println("Массив не является возрастающий");}
    }
}
