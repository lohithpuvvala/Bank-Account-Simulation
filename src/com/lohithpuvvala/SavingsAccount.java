package com.lohithpuvvala;

public class SavingsAccount extends BankAccount{
    private double interestRate = 0.03; // 3%

    public SavingsAccount(String accountHolderName, String accountNumber, double initialBalance) {
        super(accountHolderName, accountNumber, initialBalance);
    }

    //Overriding deposit to add interest on each deposit
    @Override
    public void deposit(double amount) {
        double interest = amount * interestRate;
        super.deposit(amount + interest); //Deposit with interest
        transactionsHistory.add("Interest of ₹"+interest+" added to deposit");
    }
}
