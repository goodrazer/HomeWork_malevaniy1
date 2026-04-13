package HomeWork_5_Hospital;

public class Surgeon implements Doctor{
    @Override
    public void treat() {
        System.out.println("Хирург.");
        System.out.println("Лечение: Проводит лоботомию лоботомиту. Но, исключительно для тебя, может имплант подобрать или сделать из тебя Кентавра!");
    }
}
