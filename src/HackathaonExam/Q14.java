//WJP to display duplicate character in string
package HackathaonExam;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String:");
        str = in.nextLine();
        duplicate(str);
    }

    private static void duplicate(String str) {
        int cnt=0;
        char[] inp = str.toCharArray();
        System.out.println("Duplicate Characters are:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (inp[i] == inp[j]) {
                    System.out.println(inp[j]);
                    cnt++;
                    break;
                }
            }
        }
    }


}
