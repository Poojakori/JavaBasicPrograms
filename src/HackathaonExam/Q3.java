//Given an array of integers check the Palindrome of the series.
package HackathaonExam;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = in.nextInt();
        }
        palindrome(a,n);

    }

    private static void palindrome(int[] a, int n) {
        int flag=1;
        for (int i = 0; i <= n / 2 && n != 0; i++) {
            if (a[i] != a[n - i - 1]) {
                flag = 0;
                break;
            }
        }
        if (flag == 0)
            System.out.println("Array is Not Palindrome");
        else
            System.out.println("Array is Palindrome");

    }
}
