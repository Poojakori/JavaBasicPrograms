//Program that accepts two integer values from the user and return the larger values. However if the two values are the
// same, return 0 and return the smaller value if the two values have the same remainder when divided by 6.
package Assignments;

import java.util.Scanner;


public class Assignment15 {
    public static void main(String[] args) {
        int a, b;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = in.nextInt();
        System.out.println("Enter Second number: ");
        b = in.nextInt();
        System.out.println("Largest value is:");
        if(a>b)
            System.out.println(a);
        else
            System.out.println(b);
        if(a==b)
            System.out.println("Result: 0");
        System.out.println("smaller value is:");
        if(a%6 == b%6)
            if(a<b)
                System.out.println(a);
            else
                System.out.println(b);
        else
            System.out.println("numbers are not divisible by 6");
    }
}
