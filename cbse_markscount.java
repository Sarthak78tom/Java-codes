package com.company;
import java.util.Scanner;

public class cbse_markscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a marks calculation program. Enter your marks below!!!");

        // Input student name
        System.out.println("Enter student name:");
        String name = sc.nextLine();

        // Input marks for each subject
        System.out.println("Enter Maths marks:");
        double Maths = sc.nextDouble();

        System.out.println("Enter Science marks:");
        double Science = sc.nextDouble();

        System.out.println("Enter English marks:");
        double English = sc.nextDouble();

        System.out.println("Enter Gujarati marks:");
        double Gujarati = sc.nextDouble();

        System.out.println("Enter SS marks:");
        double SS = sc.nextDouble();


        double totalMarks = Maths + Science + English + Gujarati + SS;
        double average = totalMarks / 5;
        double percentage = (totalMarks / 500) * 100;

        // Output results
        System.out.println(name + "'s Results:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}
