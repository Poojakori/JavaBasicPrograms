//Write a program to find factorial number using Recursion & Non Recursive function
package HackathaonExam;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args){
        int n;
        System.out.println("Enter the number:");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        fact(n);
        System.out.println("factorial using recursive function:"+factUsingRec(n));
    }

    private static void fact(int n) {
        int mul=1;
        for(int i=1;i<=n;i++)
            mul=mul*i;
        System.out.println("Factorial with out using Recursion :"+mul);
    }

    private static int factUsingRec(int n) {
        if(n==0)
            return 1;
        else
            return(n*factUsingRec(n-1));
    }


}
