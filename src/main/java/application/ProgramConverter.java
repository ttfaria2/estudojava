package application;

import entities.CurrencyConverter;

import java.util.Scanner;

public class ProgramConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dollar price?");
        double price = sc.nextDouble();
        System.out.println("How manny dollar to bought?");
        double dollars = sc.nextDouble();

        System.out.println("Amout to be paid in reais:");
        System.out.println(CurrencyConverter.currencyConverter(price, dollars));

        sc.close();
    }
}
