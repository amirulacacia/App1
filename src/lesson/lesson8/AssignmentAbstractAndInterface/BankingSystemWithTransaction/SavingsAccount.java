package lesson.lesson8.assignmentabstractandinterface.BankingSystemWithTransaction;

import java.util.ArrayList;
import java.util.List;

public class SavingsAccount implements BankAccount {
    private double balance;
    private double interestRate;
    private List<String> transactionHistory;

    public SavingsAccount(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
        this.transactionHistory = new ArrayList<>();
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance)
            this.balance -= amount;
        else
            System.out.println("Insuffecient funds...");

    }

    @Override
    public double getBalance() {
        balance += balance * interestRate;
        return balance;
    }

    @Override
    public void transfer(BankAccount destination, double amount) {
        if (amount <= balance){
            this.withdraw(amount);
            destination.deposit(amount);
            transactionHistory.add("Transfer to " + destination.getClass().getSimpleName() + ": -RM" + amount);
        } 
        else
            System.out.println("Insufficient funds for the transfer.");
    }

    @Override
    public String getTransactionHistory() {
        return String.join("\n", transactionHistory);
    }

}
