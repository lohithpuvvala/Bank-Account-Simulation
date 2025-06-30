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
                    break;
                case 2: //Withdraw
                    break;
                case 3://check balance
                    break;
                case 4://Print Transaction History
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("Do you want to continue? (y/n)");
            if(in.next().equalsIgnoreCase("n")){
                break;
            }
        }
    }
}
