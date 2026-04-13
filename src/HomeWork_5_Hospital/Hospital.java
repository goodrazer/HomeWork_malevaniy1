package HomeWork_5_Hospital;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
       System.out.println();
       System.out.println("_________________Вы попали в клиннику New Vegas!__________________");
       System.out.println("________Статус клинники: Мы лечим всех, кроме Легиона!!!__________");
       System.out.println();
       System.out.println("Введите код плана лечения:");
       System.out.println("1 - Хирург.");
       System.out.println("2 - Дантист.");
       System.out.println("? - Нет подходящего кода лечения? Введите любой код, у терапевта найдется для тебя пару антирадинов и докторский саквояж!");
       System.out.println();
       System.out.print("Ваш код: ");
           Scanner scanner = new Scanner(System.in);
              Therapist therapist = new Therapist();
              int code = scanner.nextInt();
              Patient patient = new Patient(code);
              therapist.assignDoctor(patient);
           scanner.close();
    }
}
