package com.lohithpuvvala;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    protected String accountHolderName;
    protected String accountNumber;
    protected double balance;
    protected List<String> transactionsHistory;

    public BankAccount(String accountHolderName, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.transactionsHistory = new ArrayList<>();

        transactionsHistory.add("Account created with balance: ₹"+ initialBalance);
    }
}
