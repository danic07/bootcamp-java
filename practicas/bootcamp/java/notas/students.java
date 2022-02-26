package practicas.bootcamp.java.notas;

import java.util.Scanner;

public class students {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner0 = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        int numStudents;
        int studentID;
        String name;
        int numExam;
        int qualification;

        System.out.println("Ingrese cantidad de estudiantes: ");
        numStudents = scanner.nextInt();

        System.out.println("inrese ID del estudiante: ");

        studentID = scanner0.nextInt();

        System.out.println("Ingrese nombre y apellidos del estudiante: ");

        name = scanner1.nextLine ();

        System.out.println("Usted ingreso el siguiente nombre " + name);

        System.out.println("Ingrese numero de examen: ");

        numExam = scanner2.nextInt();

        System.out.println("Usted ingreso el siguiente examen: " + numExam);

        System.out.println("Ingrese la nota que obtuvo el estudiante [0, 10]: ");

        qualification = scanner3.nextInt();

        System.out.println("Usted ingreso la siguiente nota: " + qualification);

        if (qualification >= 0 && qualification <= 10);
        else {System.out.println("Ingresó una nota incorrecta *[0, 10]");
            System.out.println("Ingrese la nota que obtuvo el estudiante [0, 10]: ");
            qualification = scanner3.nextInt();
            System.out.println("Usted ingreso la siguiente nota: " + qualification);
        }
    }


}

