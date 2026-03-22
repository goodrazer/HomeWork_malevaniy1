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
        int [] arraysInt = new int [sizeArrays];
        for (int i = 0; i < arraysInt.length; i++) {
            arraysInt[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arraysInt));
        boolean comparison = true;
        for (int i = 1; i < arraysInt.length; i++) {
            if (arraysInt[i] <= arraysInt[i - 1]) {
                comparison = false;
            }
        }
        if (comparison == true){
            System.out.println("Массив возрастающий");
        }
        else {System.out.println("Массив не является возрастающий");}
    }
}
