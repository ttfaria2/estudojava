package application;

import entities.Student;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Digite o nome do aluno: ");
        student.name = sc.nextLine();

        System.out.println("Digite as 3 notas:");
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());

        student.finalSituation();

        sc.close();
    }
}
