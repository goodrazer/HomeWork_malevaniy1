package HomeWork_7_StringProcessing;

public class Task_5 {
    public static void main(String[] args) {
        String wordHello = "Hello";
        System.out.println("Слово до дублирования всех букв:");
        System.out.println(wordHello);
        StringBuilder DuplicationOfLetters = new StringBuilder();
        for (int i = 0; i < wordHello.length(); i++) {
            char c = wordHello.charAt(i);
            DuplicationOfLetters.append(c).append(c);
        }
        System.out.println("Слово после дублирования всех букв:");
        System.out.println(DuplicationOfLetters);
    }
}
