//Write a Java program to extract the first half of a string of even length.
package Assignments;

import java.util.Scanner;

public class Assignment23 {
    public static void main(String[] args)
    {
        System.out.println("Enter a String to check:");
        Scanner in = new Scanner(System.in);
        String main_string = in.nextLine();
        System.out.println(main_string.substring(0, main_string.length()/2));
    }

}
