package HomeWork_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_2 {
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
        int minNumbersInArrays = ArraysInt[0];
        int maxNumbersInArrays = ArraysInt[0];

        for (int i = 0; i < ArraysInt.length; i++) {
            if (ArraysInt[i] < minNumbersInArrays) {
                minNumbersInArrays = ArraysInt[i];
            }
            if (ArraysInt[i] > maxNumbersInArrays) {
                maxNumbersInArrays = ArraysInt[i];
            }
        }
        System.out.println("Минимальное значение массива: " + minNumbersInArrays);
        System.out.println("Максимальное значение массива: " + maxNumbersInArrays);
    }
}
