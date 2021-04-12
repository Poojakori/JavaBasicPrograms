//Write a program in Java to display the multiplication table of a given integer.
package HackathaonExam;

import java.util.Scanner;

public class Q55 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String:");
        n = in.nextInt();
        System.out.println("Multiplication table:");
        multi(n);
    }

    private static void multi(int n) {
        for(int i=1;i<=10;i++){
            int mul=n*i;
            System.out.println(n+"*"+i+"="+mul);

        }

    }
}
