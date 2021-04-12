//Program to print the odd numbers from 1 to 99. Prints one number per line.
package Assignments;

public class Assignment10 {
    public static void main(String args[]) {
        int n =99;
        System.out.print("Odd  Numbers from 1 to "+n+" are: ");
        for (int i = 1; i <= n; i=i+2) {

            System.out.print(i + "\n");
        }
    }
}
