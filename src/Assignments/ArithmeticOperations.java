package Assignments;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        int a,b;
        float sum, sub, multi, div, rem;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = in.nextInt();
        System.out.println("Enter Second number: ");
        b = in.nextInt();

        sum = a+b;
        sub = a-b;
        multi = a*b;
        div = a/b;
        rem = a%b;

        System.out.println("Sum of " +a +"and"+ b+"is:"+sum);
        System.out.println("subtraction of " +a +"and"+ b+"is:"+sub);
        System.out.println("Multiplication of " +a +"and"+ b+"is:"+multi);
        System.out.println("Division of " +a +"and"+ b+"is:"+div);
        System.out.println("Reminder of " +a +"and"+ b+"is:"+rem);

    }

}
