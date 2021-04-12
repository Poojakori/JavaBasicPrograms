package Assignments;

import java.util.Arrays;

public class Assignment27 {
    public static void main(String[] args) {
        int temp;
        int[] a = {50, -20, 0};
        temp = a[0];
        a[0] = a[2];
        a[2] = temp;
        int[] newArray = {a[0], a[1], a[2]};
        System.out.println("New Array :" + Arrays.toString(newArray));
    }
}
