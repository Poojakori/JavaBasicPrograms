//Write a Java program to print the ascii value of a given character.
package Assignments;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] String) {
        int chr ;
        char a;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the character : ");
        a = in.next().charAt(0);
        chr=a;
        System.out.println("The ASCII value of Z is :"+chr);
    }
}
