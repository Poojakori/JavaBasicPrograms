//Write a Java program to check if a particular element exists in a linked list.
package HackathaonExam;

import java.util.LinkedList;
import java.util.Scanner;

public class Q65 {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList <String> ();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.add("E");
        System.out.println("Original linked list: " + l);

        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = in.nextLine();

        if (l.contains(str)) {
            System.out.println(str +" is present in the linked list.");
        } else {
            System.out.println(str+" is not present in the linked list.");
        }


    }
}
