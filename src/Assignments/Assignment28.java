package Assignments;

import java.util.Scanner;

public class Assignment28 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = in.nextInt();
        int[] a = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int mid = n / 2;
        if (a[0] > a[mid] && a[0] > a[n - 1])
            System.out.println("Largest element is:" + a[0]);
        else if (a[n - 1] > a[mid] && a[n - 1] > a[0])
            System.out.println("Largest element is:" + a[n - 1]);
        else
            System.out.println("Largest element is:" + a[mid]);
    }
}
