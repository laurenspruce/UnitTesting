package example.example;

import example.example.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(33.33);
        System.out.println(ba.getBalance());

        ba.debit(34);
        System.out.println(ba.getBalance());
    }
}
