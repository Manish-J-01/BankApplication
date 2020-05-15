package com.manish;

public class BankApplication {
    private String customerName;
    private int customerId;
    private double initialBalance;
    private double initialTransaction;

    public BankApplication() {
    }

    public BankApplication(String customerName, int customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void getDeposit(int amount) {
        if (amount != 0) {
            initialBalance = initialBalance + amount;
            System.out.println("Your new Balance " + initialBalance + " amount " + amount);
            initialTransaction += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
        public void Withdraw(int amount) {
            if (amount != 0) {
                initialBalance = initialBalance - amount;
                initialTransaction -= amount;
            }
        }
        public void getInitialTransaction() {
            if (initialTransaction > 0) {
                System.out.println("Deposited : " + initialTransaction);
            } else if (initialTransaction < 0) {
                System.out.println("Withdraw : " + Math.abs(initialTransaction));
            } else {
                System.out.println("No transaction happened");
            }
    }
}
