//
package HackathaonExam;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
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
        sort(a,n);
    }

    private static void sort(int[] a, int n) {
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (a[i]>a[j]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }

            }
        }
        System.out.println("Sorted Array:"+ Arrays.toString(a));
    }
}
