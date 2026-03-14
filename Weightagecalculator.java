//Name: Majeed Ahmad Hashmi
//Roll no: 000555
//LAB: 3

import java.util.Scanner;

public class Weightagecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your HOMEWORK grade: ");
        double Homework = sc.nextDouble();
        System.out.print("Enter your MIDTERM EXAM grade: ");
        double Midterm1 = sc.nextDouble();
        System.out.print("Enter your FINAL EXAM grade: ");
        double Finalexam1 = sc.nextDouble();

 
        if (Finalexam1 >= 50) {
            System.out.println("The student passed the class");
        } else {
            System.out.println("The student failed the class");
        }

        if (Midterm1 >= 40) {
            System.out.println("Midterm passed");
        } else {
            System.out.println("Midterm failed");
        }

        if (Homework >= 0 && Homework <= 200) {
            System.out.println("Homework is valid");
        } else {
            System.out.println("Homework is invalid");
        }

        int number = -1;
        while (number < 0) { 
            System.out.print("Enter a non-negative number for square root: ");
            number = sc.nextInt();
        }
        System.out.println("The square root of " + number + " is " + Math.sqrt(number));

        double total = (Finalexam1 / 200.0 * 0.50) + (Midterm1 / 100.0 * 0.25) + (Homework / 100.0 * 0.25);
        
        System.out.println("Total Marks = " + total);
        System.out.println("Homework grade: " + Homework);
        System.out.println("Midterm grade: " + Midterm1);
        System.out.println("Final exam grade: " + Finalexam1);

        sc.close();
    }
}
