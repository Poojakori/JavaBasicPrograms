//Write a method that will remove given character from the String?
package JavaBasicExam;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        String str;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String:");
        str = in.nextLine();
        //System.out.println("Enter a character");
        //char ch = in.next().charAt(0);
        System.out.println("String after removing character: " + str.replace("a", ""));
    }
}
