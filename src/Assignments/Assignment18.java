//Program to calculate the modules of two numbers without using any inbuilt modulus operator.
package Assignments;

import java.util.Scanner;

public class Assignment18 {

    static int getRemainder(int num, int divisor) {

        return (num - divisor * (num / divisor));
    }

    public static void main(String[] args) {
        int a, b;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        a = in.nextInt();

        System.out.println("Enter 2nd number: ");
        b = in.nextInt();

        System.out.println("reminder is:"+getRemainder(a, b));
    }
}