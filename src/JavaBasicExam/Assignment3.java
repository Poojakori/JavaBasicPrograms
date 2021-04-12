//Given a string print the reverse of the string.(Input: Java Code Output: edoC avaJ)
package JavaBasicExam;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args){
        String str,rev="";

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String:");
        str=in.nextLine();

        int l = str.length();

        for (int i = l - 1 ; i >= 0 ; i--)
            rev = rev + str.charAt(i);

        System.out.println("Reverse of the string: " + rev);

    }
}
