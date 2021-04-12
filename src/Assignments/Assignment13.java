//Program to convert a given string into lowercase.
package Assignments;

import java.util.Scanner;

public class Assignment13 {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String:");
        str = in.nextLine();

        String lowerCase = str.toLowerCase();
        System.out.println("Converted string:\n" + lowerCase);
    }
}
