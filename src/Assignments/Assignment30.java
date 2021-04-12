//program to merge two given sorted array of integers and create a new sorted array
package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment30 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = in.nextInt();
        int[] a = new int[n];

        System.out.println("Enter all the elements of array1:");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.print("Enter no. of elements you want in array:");
        int m = in.nextInt();
        int b[] = new int[m];
        System.out.println("Enter all the elements of array2:");
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }
        int[] c = new int[m+n];
        sortAndMerge(a,b,c,m,n);
    }

    private static void sortAndMerge(int[] a, int[] b, int[] c,int m,int n) {
        int k=0,i=0,j=0;
        while (i < n && j < m)
        {
            if (a[i] < b[j])
            {
                c[k] = a[i];
                i++;
            }
            else
            {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < n)
        {
            c[k] = a[i];
            i++;
            k++;
        }

        while (j < m)
        {
            c[k] = b[j];
            j++;
            k++;
        }


        System.out.println("new array :" + Arrays.toString(c));
    }


}
