//Program to replace all the 'd' characters with 'f' characters.
package Assignments;

import java.util.Scanner;

public class Assignment21 {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String1:");
        str = in.nextLine();

        String new_str = str.replace('d', 'f');

        System.out.println("New String: " + new_str);
    }
}
