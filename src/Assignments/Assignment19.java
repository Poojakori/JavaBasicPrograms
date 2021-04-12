//Program to check whether a given string ends with the contents of another string.
package Assignments;

import java.util.Scanner;

public class Assignment19 {
    public static void main(String[] args) {
        String str1,str2,str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String1:");
        str1 = in.nextLine();

        System.out.println("Enter a String2:");
        str2 = in.nextLine();

        System.out.println("Enter a String to check:");
        str = in.nextLine();

        boolean ends1 = str1.endsWith(str);
        boolean ends2 = str2.endsWith(str);

        System.out.println("\"" + str1 + "\" ends with " +
                "\"" + str + "\"? " + ends1);

        System.out.println("\"" + str2 + "\" ends with " +
                "\"" + str + "\"? " + ends2);
    }
}
