package com.java.coreLabs;

public abstract class Account {
    int id; //
    String name;
    double balance;
    boolean active;


    public Account() {
        System.out.println("default constructor called");
    }

    public Account(int id, String name, String type, double balance, boolean active) {
        System.out.println("parameter constructor called");
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.active = active;
    }

    public abstract void openAccount();

    public abstract void closedAccount();

    void deposit(double amount) {
        System.out.println("deposited "+amount);
        this.balance += amount;
    }

    void withdraw(double amount) {
        if(this.balance > amount) return;
        System.out.println("withdrawn "+amount);
        this.balance -= amount;
    }

    double checkBalance() {
        return balance;
    }



}
