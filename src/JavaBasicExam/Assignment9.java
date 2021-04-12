//WJP to merge two sorted array.(Do not use third array) array1[10] = 1,2,4,6,9,10 array 2[4]= 3, 5,7,8 After merge : array1[10] = 1,2,3,4,5,6,7,8,9,10


        package JavaBasicExam;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args){
        int array1[] = {1, 2, 4, 6, 9, 10};
        int array2[]= {3, 5, 7, 8};
        int m=array1.length;
        int n=array2.length;
        merge(array1,array2,m,n);
    }

    public static void merge(int ar1[], int ar2[], int m, int n)
    {
        // Iterate through all elements of ar2[] starting from
        // the last element
        for (int i=n-1; i>=0; i--)
        {
        /* Find the smallest element greater than ar2[i]. Move all
           elements one position ahead till the smallest greater
           element is not found */
            int j, last = ar1[m-1];
            for (j=m-1; j >= 0 && ar1[j] > ar2[i]; j--)
                ar1[j+1] = ar1[j];

            // If there was a greater element
            if (j != m-1)
            {
                ar1[j+1] = ar2[i];
                ar2[i] = last;
            }
        }
    }

}
