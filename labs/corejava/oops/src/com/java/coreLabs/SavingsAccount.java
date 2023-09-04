package com.java.coreLabs;

public class SavingsAccount extends Account{
    @Override
    public void openAccount() {
        System.out.println("opened savings account");

    }

    @Override
    public void closedAccount() {
        System.out.println("closed account");
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", active=" + active +
                '}';
    }
}
