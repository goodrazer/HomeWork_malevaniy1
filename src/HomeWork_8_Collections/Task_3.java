package HomeWork_8_Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           System.out.println("Введите элементы массива (строки) через запятую:");
           String inputString = scanner.nextLine();
        scanner.close();
        String[] strings = inputString.split(",");
        System.out.println("Следующие строки встречаются несколько раз: ");
        System.out.println(wordMultiple(strings));
        }
        static Map<String, Boolean> wordMultiple(String[] strings) {
            Map<String, Boolean> result = new HashMap<>();
            for (String s : strings) {
                result.put(s, result.containsKey(s));
            }
            return result;
        }

}
