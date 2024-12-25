package com.company;

import java.util.Scanner;
public class Swappin2number {
    public static void main(String[] args) {
        System.out.println("this is the code of swapping two numbers without taking the 3rd variable!!   " +
                "enter below your x and y");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("this is the entered value for X:"  + x);
        System.out.println("this is the entered value for Y:"  + y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("Here is the result after the Swapping for X : " + x);
        System.out.println("Here is the result after the Swapping for Y : " + y);


    }
}