package JavaBasicExam;

import java.util.Scanner;

public class Assignment12 {
    public static void main (String[] args) {
        int a, b, c, d;
        System.out.println("Enter the Number1:");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        System.out.println("Enter the Number2:");
        b = in.nextInt();
        System.out.println("Enter the Number3:");
        c = in.nextInt();
        System.out.println("Enter the Number4:");
        d = in.nextInt();
        if (a == b && b==c&&c==d) {
            System.out.println("Numbers are equal.");
        }
        else{
            System.out.println("Numbers are not equal.");
        }
    }
}
