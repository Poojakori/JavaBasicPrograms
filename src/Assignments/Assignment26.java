//program to create a new array of length 2 from two arrays of integers with three elements and the new array will
// contain the first and last elements from the two arrays
package Assignments;

import java.util.Arrays;

public class Assignment26 {
    public static void main(String[] args) {

        int[] a = {50, -20, 0};
        int[] b = {5, -50, 10};
        System.out.println("Array1 :"+Arrays.toString(a));
        System.out.println("Array2 :"+Arrays.toString(b));
        int[] new_array = {a[0], b[2]};
        System.out.println("New Array :"+Arrays.toString(new_array));
    }


}
