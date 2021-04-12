//WJP to perform ascending order Selection sort
package HackathaonExam;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        selectionSort(a,n);
    }

    private static void selectionSort(int[] a, int n) {
        for (int i = 0; i < n-1; i++)
        {
            int minIdx = i;
            for (int j = i+1; j < n; j++) {
                if (a[j] < a[minIdx]) {
                    minIdx = j;
                }
                    int temp = a[minIdx];
                    a[minIdx] = a[i];
                    a[i] = temp;

            }
        }
        System.out.println("Sorted Array:"+ Arrays.toString(a));
    }
}
