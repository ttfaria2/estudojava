package application;

import entities.Employee;

import java.util.Scanner;

public class ProgramSalary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Name:");
        employee.name = sc.nextLine();
        System.out.println("Gross Salary:");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Tax:");
        employee.tax = sc.nextDouble();

        System.out.print("Employee: " + employee);

        System.out.println("Wich percentage to increase? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.print("Updated data: " + employee);

        sc.close();
    }
}
