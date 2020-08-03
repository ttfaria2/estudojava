package entities;


public class Student {

        public String name;
        public Double nota1;
        public Double nota2;
        public Double nota3;

        public double finalGrade() {
            return nota1 + nota2 + nota3;
        }

        public void finalSituation() {
            if (finalGrade() < 60.00) {
                    double missing = 60.00 - finalGrade();
                    System.out.println("FAILED");
                    System.out.printf("MISSING %.2f POINTS", missing);
            }
            else {
                    System.out.println("PASS");
            }


        }
}
