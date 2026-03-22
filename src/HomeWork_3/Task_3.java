package HomeWork_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_3 {
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
        int minIndex = 0;
        int maxIndex = 0;
           for (int i = 0; i < ArraysInt.length; i++) {
              if (ArraysInt[i] < ArraysInt[minIndex]) {
                minIndex = i;
              }

              if (ArraysInt[i] > ArraysInt[maxIndex]) {
                maxIndex = i;
              }
        }
        System.out.println("Индекс минимального значения массива: " + minIndex);
        System.out.println("Индекс максимального значения массива: " + maxIndex);
    }
}
