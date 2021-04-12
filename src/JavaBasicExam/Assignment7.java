package JavaBasicExam;

import java.util.Scanner;

public class Assignment7 {

    public static void main(String[] args) {
        int a, b;
        float sub, multi = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = in.nextInt();
        System.out.println("Enter Second number: ");
        b = in.nextInt();

        sub = a + ~b + 1;

        System.out.println("Subtraction:" + sub);

        for (int i = 1; i <= b; i++)
            multi = multi + a;

        System.out.println("Multiplication:" + multi);

        int sign = 1;
        if (a < 0) {
            a = -a;
            sign = -1;
        } else if (b < 0) {
            b = -b;
            sign = sign * (-1);
        }
        int temp = b;
        int quotient = 1;
        if ((a != 0 && b != 0) && (b < a)) {
            while (((temp << 1) - a) < 0) {
                temp = temp << 1;
                quotient = quotient << 1;
            }
            while ((temp + b) <= a) {
                temp = temp + b;
                quotient = quotient + 1;
            }
        } else if (a == 0) {
            quotient = 0;
        }
        System.out.println("\nDivision: " + quotient * sign);

    }
}