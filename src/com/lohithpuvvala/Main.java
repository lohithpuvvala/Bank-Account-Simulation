package com.lohithpuvvala;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SavingsAccount savingsAccount = new SavingsAccount("Lohit", "SB1001", 5000);

        while(true){
            System.out.println("\n====== Bank Menu ======");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Print Transactions History");

            int choice = in.nextInt();

            switch (choice){
                case 1: //Deposit
                    System.out.println("Enter amount to deposit: ");
                    double amountToDeposit = in.nextDouble();
                    savingsAccount.deposit(amountToDeposit);
                    break;
                case 2: //Withdraw
                    System.out.println("Enter amount to withdraw: ");
                    double amountToWithdraw = in.nextDouble();
                    savingsAccount.withdraw(amountToWithdraw);
                    break;
                case 3://check balance
                    System.out.println("Current Balance: ₹"+savingsAccount.getBalance());
                    break;
                case 4://Print Transaction History
                    savingsAccount.printTransactionsHistory();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("Do you want to continue? (y/n)");
            if(in.next().equalsIgnoreCase("n")){
                System.out.println("Thank You! Exiting...");
                break;
            }
        }
    }
}
