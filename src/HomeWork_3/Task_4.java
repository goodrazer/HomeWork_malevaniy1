package HomeWork_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива:");
        Scanner scanner = new Scanner(System.in);
        int sizeArrays = scanner.nextInt();
        Random random = new Random();
        int [] ArraysInt = new int [sizeArrays];
        for (int i = 0; i < ArraysInt.length; i++) {
            ArraysInt[i] = random.nextInt(3);
        }
        System.out.println(Arrays.toString(ArraysInt));
        int countNullValues = 0;
        for (int i = 0; i < ArraysInt.length; i++) {
            if (ArraysInt[i] == 0) {
                countNullValues ++;
            }
        }
        if (countNullValues == 0) {
            System.out.println("Нулевой тут только разработчик, в элементах массива отсутствуют нулевые значения!");
        }
        else {
            System.out.println("Количество нулевых значений элементов массива: " + countNullValues);
        }
    }
}
