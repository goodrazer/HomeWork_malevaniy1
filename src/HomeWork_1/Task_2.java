package HomeWork_1;

public class Task_2 {
    public static void main(String[] args) {
        int n, tensDigit, unitDigit, sumDigit;
        n = 69;
        tensDigit = n / 10;
        unitDigit = n % 10;
        sumDigit = unitDigit + tensDigit;
        System.out.println(sumDigit);
    }
}
