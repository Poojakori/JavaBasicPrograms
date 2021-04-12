//Program to create the concatenation of the two strings except removing the first character of each string
package Assignments;

import java.util.Scanner;

public class Assignment17 {
    public static void main(String[] args) {
        String str1,str2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String1:");
        str1 = in.nextLine();

        System.out.println("Enter a String2:");
        str2 = in.nextLine();

        System.out.println(str1.substring(1) + str2.substring(1));
    }
}
