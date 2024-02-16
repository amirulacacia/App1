package lesson.lesson8.AssignmentAbstractAndInterface.BankingSystemWithTransaction;

import java.util.ArrayList;
import java.util.List;

public class CheckingAccount implements BankAccount {
    private double balance;
    private double overdraftLimit;
    private List<String> transactionHistory;

    public CheckingAccount(double initialBalance, double overdraftLimit) {
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
        this.transactionHistory = new ArrayList<>();
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
        } else
            System.out.println("Overdraft limit exceeded...");

    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void transfer(BankAccount destination, double amount) {
        if (amount <= balance + overdraftLimit) {
            this.withdraw(amount);
            destination.deposit(amount);
            transactionHistory.add("Transfer to " + destination.getClass().getSimpleName() + ": -RM" + amount);
        } else
            System.out.println("Insufficient funds for the transfer.");
    }

    @Override
    public String getTransactionHistory() {
        return String.join("\n", transactionHistory);
    }
}
