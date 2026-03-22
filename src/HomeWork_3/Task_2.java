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
        int [] arraysInt = new int [sizeArrays];
        for (int i = 0; i < arraysInt.length; i++) {
            arraysInt[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arraysInt));
        int minNumbersInArrays = arraysInt[0];
        int maxNumbersInArrays = arraysInt[0];

        for (int i = 0; i < arraysInt.length; i++) {
            if (arraysInt[i] < minNumbersInArrays) {
                minNumbersInArrays = arraysInt[i];
            }
            if (arraysInt[i] > maxNumbersInArrays) {
                maxNumbersInArrays = arraysInt[i];
            }
        }
        System.out.println("Минимальное значение массива: " + minNumbersInArrays);
        System.out.println("Максимальное значение массива: " + maxNumbersInArrays);
    }
}
