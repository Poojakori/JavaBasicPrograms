//program to multiply corresponding elements of two arrays of integers
package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment29 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = in.nextInt();
        int[] a = new int[n];
        int[] c = new int[n];
        System.out.println("Enter all the elements of array1:");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int[] b = new int[n];
        System.out.println("Enter all the elements of array2:");
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        multi(a,b,c);
    }

    private static void multi(int[] a, int[] b,int[] c) {

        for(int i=0; i<a.length;i++){
            for(int j=0;j<b.length;j++){
                c[i]=a[i]*b[i];
            }

        }
        System.out.println("Multiplication of 2 array :" + Arrays.toString(c));

    }

}
