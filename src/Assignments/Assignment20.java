//Program to compare a given string to another string, ignoring case considerations.
package Assignments;
import java.util.Scanner;

public class Assignment20 {
    public static void main(String[] args) {
        String str1, str2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String1:");
        str1 = in.nextLine();

        System.out.println("Enter a String2:");
        str2 = in.nextLine();

        boolean equals1 = str1.equalsIgnoreCase(str2);

        System.out.println("\"" + str1 + "\" equals \"" + str2 + "\"? " + equals1);


    }
}

