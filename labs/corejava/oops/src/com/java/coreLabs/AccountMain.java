package com.java.coreLabs;

public class AccountMain {
    public static void main(String[] args){
        SavingsAccount acc1 = new SavingsAccount();
        acc1.openAccount();
        acc1.closedAccount();
        System.out.println(acc1);
    }
}
