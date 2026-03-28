package HomeWork_4;

public class LogicATM {
    int banknoteCount20;
    int banknoteCount50;
    int banknoteCount100;

    LogicATM(int count20, int count50, int count100) {
        this.banknoteCount20 = count20;
        this.banknoteCount50 = count50;
        this.banknoteCount100 = count100;
    }
    public void addMoney(int add20, int add50, int add100) {
        this.banknoteCount20 = banknoteCount20 + add20;
        this.banknoteCount50 = banknoteCount50 + add50;
        this.banknoteCount100 = banknoteCount100 + add100;
        System.out.println();
        System.out.println("Операция: Внесени денежных средств.");
        System.out.println("Статус операции: Успешно!");
        System.out.println("Текущий баланс вашего счета: " + getBalance() + " руб.");
    }
    int getBalance() {
        return banknoteCount20 * 20 + banknoteCount50 * 50 + banknoteCount100 * 100;
    }
    boolean withdrawMoney(int amount) {
        System.out.println();
        System.out.println("Попытка снять сумму: " + amount + " руб.");
        if (amount > getBalance() || amount % 10 != 0) {
            System.out.println("Ошибка выполнения операции снятия денежных средств!!!");
            System.out.println("Недостаточно купюр необходимого номинала в банкомате!");
            return false;
        }
        int temp100 = 0, temp50 = 0, temp20 = 0;
        int remainingAmount = amount;
        temp100 = remainingAmount / 100;
        if (temp100 > banknoteCount100) temp100 = banknoteCount100;
        remainingAmount = remainingAmount - temp100 * 100;
        temp50 = remainingAmount / 50;
        if (temp50 > banknoteCount50) temp50 = banknoteCount50;
        remainingAmount = remainingAmount - temp50 * 50;
        temp20 = remainingAmount / 20;
        if (temp20 > banknoteCount20) temp20 = banknoteCount20;
        remainingAmount = remainingAmount - temp20 * 20;
        if (remainingAmount == 0) {
            this.banknoteCount100 = banknoteCount100 - temp100;
            this.banknoteCount50 = banknoteCount100 - temp50;
            this.banknoteCount20 = banknoteCount100 - temp20;
            System.out.println("Операция: Снятие денежных средств.");
            System.out.println("Статус операции: Успешна!");
            System.out.println("Выдано купюр номиналом:");
            System.out.println("100 руб.: " + temp100 + " шт.");
            System.out.println("50 руб.: " + temp50 + " шт.");
            System.out.println("20 руб.: " + temp20 + " шт.");
            return true;
        }
        else {
            System.out.println("Операция: Снятие денежных средств.");
            System.out.println("Статус операции: Ошибка!");
            System.out.println("Невозможно выдать сумму указанным номиналом!");
            return false;
        }
    }
}
