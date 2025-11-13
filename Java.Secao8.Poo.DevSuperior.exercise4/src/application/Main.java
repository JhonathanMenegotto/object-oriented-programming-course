package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("First Note: ");
        Double firstNote = sc.nextDouble();
        System.out.print("Second Note: ");
        Double secondNote = sc.nextDouble();
        System.out.print("Third Note: ");
        Double thirdNote = sc.nextDouble();

        Student student = new Student(name, firstNote, secondNote, thirdNote);

        if(student.media() <= 6.0){
            System.out.println("FINAL GRADE = " + String.format("%.2f", student.media()));
            System.out.println("FAILED");
            System.out.println("MISSING " + ( String.format("%.2f",6.0 - student.media())));
        } else{
            System.out.println("FINAL GRADE = " + String.format("%.2f", student.media()));
            System.out.println("PASS");
        }

        sc.close();


    }
}