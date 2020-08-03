package application;

import entities.Account;

import java.util.Scanner;

public class ProgramAccount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("Enter account number");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name");
        String name = sc.nextLine();

        System.out.println("Is the any initial value do insert? y/n");
        char response = sc.next().charAt(0);

        if(response == 'y'){
            System.out.println("Enter the initial value to insert");
            double initialDeposit = sc.nextDouble();
            account = new Account(accountNumber, name, initialDeposit);
            System.out.println("Account Data:\n" + account);
        } else {
            account = new Account(accountNumber, name);
            System.out.println("Account Data:\n" + account);
        }

        System.out.println("Change the value of the account");
        double accountValue = sc.nextDouble();
        account.deposit(accountValue);

        System.out.println("Updated Account: " + account);

        System.out.println("Digite o valor de saque da conta: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);

        System.out.println("Updated Account: " + account);

        sc.close();
    }
}