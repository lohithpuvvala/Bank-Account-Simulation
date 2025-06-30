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

    public void deposit(double amount)
    {
        if(amount > 0)
        {
            balance += amount;
            transactionsHistory.add("Desposited ₹"+amount+" | Balance: ₹"+balance);
        }else{
            transactionsHistory.add("Failed to deposit amount of ₹"+amount);
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            transactionsHistory.add("Withdraw ₹"+amount+" |Balance: ₹"+balance);
        }else if(amount > balance){
            System.out.println("Insufficient balance");
        }
        else{
            transactionsHistory.add("Failed withdrawal attempt of ₹"+amount);
        }
    }

    public double getBalance(){
        return balance;
    }

    public void printTransactionsHistory(){
        System.out.println("Transactions History for Account: "+accountNumber);
        for(String t: transactionsHistory){
            System.out.println(t);
        }
    }
}
