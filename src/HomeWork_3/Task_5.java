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
        int [] arraysInt = new int [sizeArrays];
        for (int i = 0; i < arraysInt.length; i++) {
            arraysInt[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arraysInt));
        for (int i = 0; i < arraysInt.length / 2; i++) {
            int bufferElements = arraysInt[i];
            arraysInt[i] = arraysInt[arraysInt.length - 1 - i];
            arraysInt[arraysInt.length - 1 - i] = bufferElements;
        }
        System.out.println(Arrays.toString(arraysInt));
    }
}
