package com.chalapathi;


import java.io.FileInputStream;

class InsufficientFundsException extends Exception {
    private double amount;
    public InsufficientFundsException(double amount) {
        super("Insufficient funds: " + amount);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

class CheckingAccount {
    private double balance;

    public CheckingAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(amount - balance);
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

// Example of using the custom exception
public class BankDemo {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(100.00);
        try {
            account.withdraw(150.00);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());

        }
    }
}
