package HomeWork_4;

import java.math.BigDecimal;

public class CreditCard {
        String accountNumber;
        BigDecimal currentBalance;
        public CreditCard(String accountNumber, BigDecimal initialBalance) {
            this.accountNumber = accountNumber;
            this.currentBalance = initialBalance;
        }
        public void deposit(BigDecimal amount) {
            if (amount.compareTo(BigDecimal.ZERO) > 0) {
                currentBalance = currentBalance.add(amount);
            }
        }
        public void withdraw(BigDecimal amount) {
            if (amount.compareTo(BigDecimal.ZERO) > 0 && currentBalance.compareTo(amount) >= 0) {
                currentBalance = currentBalance.subtract(amount);
            } else {
                System.out.println("Недостаточно средств на карте " + accountNumber + " или введена некорректная сумма.");
            }
        }
        public void balanceCardInformation() {
            System.out.println("Номер счета: " + accountNumber + ", Текущая сумма: " + currentBalance);
        }
    }


