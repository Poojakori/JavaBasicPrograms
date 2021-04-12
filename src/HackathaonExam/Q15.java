//WJP to convert string to int
package HackathaonExam;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String:");
        str = in.nextLine();
        System.out.println("Converted int:" + Integer.parseInt(str));
    }

}
