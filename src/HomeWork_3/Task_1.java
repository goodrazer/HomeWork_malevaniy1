package HomeWork_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_1 {
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
        System.out.println("Вывожу элементы массива в обратном порядке:");
           for (int i = arraysInt.length - 1; i >= 0; i--) {
              System.out.print(arraysInt[i] + " ");
        }
    }
}