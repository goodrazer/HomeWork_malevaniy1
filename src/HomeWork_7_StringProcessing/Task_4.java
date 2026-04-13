package HomeWork_7_StringProcessing;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
           System.out.println("Введите первую строку:");
           String firstString = scanner1.nextLine();
        Scanner scanner2 = new Scanner(System.in);
           System.out.println("Введите вторую строку:");
           String secondString = scanner2.nextLine();
        Scanner scanner3 = new Scanner(System.in);
           System.out.println("Введите третью строку:");
           String thirdString = scanner3.nextLine();
        scanner1.close();
        scanner2.close();
        scanner3.close();
        String[] arrAllText = {firstString, secondString, thirdString};
        String result = null;
        for (int i1 = 0; i1 < arrAllText.length; i1++) {
            if (result != null)
                break;
            String[] breakingTextIntoWords = arrAllText[i1].split("\\s+");
            for (int i2 = 0; i2 < breakingTextIntoWords.length; i2++) {
                String word = breakingTextIntoWords[i2];
                if (word.isEmpty()) {
                    continue;
                }
                boolean unique = true;
                for (int i3 = 0; i3 < word.length(); i3++) {
                    for (int l = i3 + 1; l < word.length(); l++) {
                        if (word.charAt(i3) == word.charAt(l)) {
                            unique = false;
                            break;
                        }
                    }
                    if (!unique) {
                        break;
                    }
                    if (unique) {
                        result = word;
                        break;
                    }
                }
            }
            if (result != null) {
                System.out.println("Первое найденное слово из различных и неповторяющихся символов: " + result);
            } else {
                System.out.println("Слово из различных и неповторяющихся символов не обнаружено!");
            }
        }
    }
}
