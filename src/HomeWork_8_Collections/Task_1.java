package HomeWork_8_Collections;


import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           System.out.println("Введите набор целых чисел через запятую:");
           String inputNumbers = scanner.nextLine();
        scanner.close();
        String[] arrayElementsInputNumbers = inputNumbers.split(",");
        Set<String> removingDuplicateElements = new LinkedHashSet<>(Arrays.asList(arrayElementsInputNumbers));
        System.out.println("Выведен набор из целых чисел без дубирования повторяющихся элементов : ");
        System.out.println(String.join(",", removingDuplicateElements));
    }
}