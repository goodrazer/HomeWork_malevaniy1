package HomeWork_5_Hospital;

public class Dentist implements Doctor {
    @Override
    public void treat() {
        System.out.println("Дантист.");
        System.out.println("Лечение: Имплантирует тебе челюсть Когтя смерти.");
    }
}
