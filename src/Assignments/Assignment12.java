//Write a Java program to convert a string to an integer in Java.
package Assignments;

import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String str1 = in.nextLine();
        int result = Integer.parseInt(str1);
        System.out.printf("The integer value is:"+ result);
    }

}
