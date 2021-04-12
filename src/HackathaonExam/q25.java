package HackathaonExam;

import java.lang.reflect.Array;
import java.util.Arrays;

public class q25 {
    public void merge( int[] A, int[] B, int size_A, int size_B )
    {
        int total_size = size_A + size_B;
        int point_A = size_A - 1;
        int point_B = size_B - 1;
        for( int i = total_size - 1; i >= 0; i-- )
        {
            if( point_A >= 0 && point_B >=0 )
            {
                if( A[point_A] >= B[point_B] )
                {
                    A[i] = A[point_A--];
                }
                else
                {
                    A[i] = B[point_B--];
                }
            }
            else if( point_B >= 0 )
            {
                A[i] = B[point_B--];
            }
            else
            {
                break;
            }
        }
    }
    public static void main( String[] args )
    {
        int[] a = {1,3,5,7,0,0,0,0,0,0,0,0,0};
        int[] b = {2,4,6,8};
        q25 m = new q25();
        System.out.println("Array A:"+ Arrays.toString(a));
        System.out.println("Array A:"+ Arrays.toString(b));
        m.merge( a, b, 4, 4 );
        System.out.println("Merged array");
        for( int i = 0; i < 8; i++ )
        {
            System.out.print( a[i] +"\n");
        }
        System.out.println();
    }
}
