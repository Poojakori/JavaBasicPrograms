//Accept an integer (x) and computes the value of x+xx+xxx+xxxx. eg: 5+55+555+5555.
package Assignments;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        int x, a, b, c, d;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        x = in.nextInt();
        a = (x*10)+x;
        b = (x*100)+a;
        c = (x*1000)+b;
        System.out.println(x+"+"+a+"+"+b+"+"+c+"="+(x+a+b+c));
    }
}
