package HomeWork_4;

public class Task_2_ATM_Main {
    public static void main(String[] args) {
        LogicATM LogicATM = new LogicATM(10, 10, 10);
        LogicATM.addMoney(5, 0, 0);
        if (LogicATM.withdrawMoney(370)) {
            System.out.println("Операция успешно завершена.");
        } else {
            System.out.println("Операция не удалась!");
            System.out.println("Попробуйте еще раз.");
        }
    }
}
