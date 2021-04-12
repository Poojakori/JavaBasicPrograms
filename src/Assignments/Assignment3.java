//Program to compare two numbers.
package Assignments;

import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) {
        int a, b;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = in.nextInt();
        System.out.println("Enter Second number: ");
        b = in.nextInt();

        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a < b) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println(a + " is equal to " + b);
        }

    }

}