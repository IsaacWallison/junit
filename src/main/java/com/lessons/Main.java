package com.lessons;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(500, 0);
        System.out.println(bankAccount.getBalance());
    }
}