package JavaBasicExam;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args){
    int n;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter no. of elements you want in array:");
    n = in.nextInt();
    int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.print("Enter key to Search:");
        int x = in.nextInt();
        int last=a.length-1;
        binarySearch(a,0,last,x);


    }

    private static void binarySearch(int[] a, int i, int last, int x) {
        int mid = (i + last)/2;
        while( i <= last ){
            if (a[mid] < x ){
                i = mid + 1;
            }
            else if (a[mid] == x){
                System.out.println("Element is found at index: " + mid);
                break;
            }
            else{
                last = mid - 1;
            }
            mid = (i + last)/2;
        }
        if ( i > last ){
            System.out.println("Element is not found!");
        }

    }
}
