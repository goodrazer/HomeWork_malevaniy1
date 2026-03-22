package HomeWork_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_5 {
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
        for (int i = 0; i < ArraysInt.length / 2; i++) {
            int bufferElements = ArraysInt[i];
            ArraysInt[i] = ArraysInt[ArraysInt.length - 1 - i];
            ArraysInt[ArraysInt.length - 1 - i] = bufferElements;
        }
        System.out.println(Arrays.toString(ArraysInt));
    }
}
