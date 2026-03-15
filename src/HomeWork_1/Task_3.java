package HomeWork_1;

public class Task_3 {
    public static void main(String[] args) {
        int n, hundredDigit, tensDigit, unitDigit, sumDigit;
        n = 111;
        hundredDigit = n / 100;
        tensDigit = (n / 10) % 10;
        unitDigit = n % 10;
        sumDigit = unitDigit + tensDigit + hundredDigit;
        System.out.println(sumDigit);
    }
}
