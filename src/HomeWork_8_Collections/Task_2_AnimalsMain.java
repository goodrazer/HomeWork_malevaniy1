package HomeWork_8_Collections;

import java.util.Scanner;

public class Task_2_AnimalsMain {
    public static void main(String[] args) {
        AnimalsLogic animals = new AnimalsLogic();
        animals.addAnimal("Хрюнятина");
        animals.addAnimal("Волколак");
        animals.addAnimal("Бобир-Курва");
        System.out.println(animals);
        Scanner scannerInputAnimal = new Scanner(System.in);
           System.out.print("Введите название нового животного: ");
           String nameAnimal = scannerInputAnimal.nextLine();
        scannerInputAnimal.close();
        animals.addAnimal(nameAnimal);
        System.out.println("Добавлено новое животное '"+ nameAnimal + "' в начало коллекции:");
        System.out.println(animals);
        System.out.println("Удалено последнее животное с конца коллекции: ");
        animals.removeAnimal();
        System.out.println(animals);
    }
}
