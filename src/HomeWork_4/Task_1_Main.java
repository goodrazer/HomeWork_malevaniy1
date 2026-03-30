package HomeWork_4;

import java.math.BigDecimal;

public class Task_1_Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("40817810400210001231", new BigDecimal("100.00"));
        CreditCard card2 = new CreditCard("40817810400210001232", new BigDecimal("200.50"));
        CreditCard card3 = new CreditCard("40817810400210001233", new BigDecimal("300.10"));
        card1.deposit(new BigDecimal("1000.00"));
        card2.deposit(new BigDecimal("150.10"));
        card3.withdraw(new BigDecimal("10.00"));
        System.out.println("Состояние карточек:");
        card1.balanceCardInformation();
        card2.balanceCardInformation();
        card3.balanceCardInformation();
    }
}
