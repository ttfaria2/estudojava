package application;

import entities.Rent;

import java.util.Scanner;

public class ProgramRent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.println("Enter the number of rooms to be rented: ");
        int n = sc.nextInt();

        for(int i=1; i<= n; i++) {
            sc.nextLine();
            System.out.println("Rent #" + i + ":");
            System.out.println("Enter the name of the guest:");
            String name = sc.nextLine();
            System.out.println("Enter the email of the guest:");
            String email = sc.nextLine();
            System.out.println("Enter the room:");
            int room = sc.nextInt();
            vect[room] = new Rent(name, email);
        }

        System.out.println("Busy Rooms: ");
        for (int i=0; i< 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }
        sc.close();
    }
}