package application;

import entities.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramWorker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many workers to be registered?");
        int n = sc.nextInt();

        List<Worker> list = new ArrayList<>();

        for (int i=1; i<=n; i++ ) {
            System.out.println("Worker #" + i + ": ");

            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            list.add(new Worker (id, name, salary));
        }

        System.out.println("Enter the worker to have the salary increase: ");
        int id = sc.nextInt();
        Worker wk = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(wk == null){
            System.out.println("Id doesnt exist!");
        }
        else {
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            wk.increaseSalary(percentage);
        }

        System.out.println("List of workers:");
        for(Worker obj : list) {
            System.out.println(obj);
        }

        sc.close();
    }
}