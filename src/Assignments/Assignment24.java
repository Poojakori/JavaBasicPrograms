//program to test if 10 appears as either the first or last element of an array of integers. The length of the array
// must be greater than or equal to 2
package Assignments;

import java.util.Scanner;

public class Assignment24 {
    public static void main(String[] args)
    {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        System.out.println((a[0] == 10 || a[a.length-1] == 10));
    }
}
