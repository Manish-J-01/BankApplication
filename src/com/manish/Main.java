package com.manish;

import java.util.Scanner;

public class Main {
    // private static Scanner sc = new Scanner(System.in);
  private static BankApplication bankApplication;
    public static void main(String[] args) {
        BankApplication bankAccount = new BankApplication("Manish", 123456);
        System.out.println("Customer Name: " + bankAccount.getCustomerName() + "\nCustomer Account Number: " + bankAccount.getCustomerId());
        showTransaction();
    }

    public static void showTransaction() {
        Scanner sc = new Scanner(System.in);
       BankApplication bk = new BankApplication();
        int option;
        System.out.println("Welcome to the Banking System.");
        System.out.println("What You like to do, Please kindly press the number");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Initial Transaction");
        System.out.println("5. Exit");
        do {
            System.out.println("Enter an option");
            option = sc.nextInt();
            System.out.println("\n");
            switch (option) {
                case 1:
                    System.out.println("Balance: " + bk.getInitialBalance());
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("Enter the amount you like to deposit:");
                    int amount = sc.nextInt();
                    bk.getDeposit((int) amount);
                    System.out.println("\n");
                case 3:
                    System.out.println("Enter an amount you want to withdraw:");
                    int amount1 = sc.nextInt();
                    bk.Withdraw((int) amount1);
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("............");
                    bk.getInitialTransaction();
                    System.out.println("\n");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid Option!! Please enter again");
                    break;
            }

        } while (option != 5);
        System.out.println("Thank You for using our service");

    }
}