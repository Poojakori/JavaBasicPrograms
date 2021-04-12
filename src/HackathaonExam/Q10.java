//Write a program to check palindrome (MalayalaM) for both numbers and string?
package HackathaonExam;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter string which you want to check whether Palindrome or not::");
            String inputText = in.next();

            checkInputTextPalindrome(inputText);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void checkInputTextPalindrome(String inputText) {
        if (inputText == null || inputText.trim().isEmpty()){
            System.out.println("Enter valid input text..");
            return;
        }
        boolean isPalidrome =false;
        String reversedOutput = reverseInput(inputText);
        if(inputText.equalsIgnoreCase(reversedOutput))
            isPalidrome = true;
        if(isPalidrome)
            System.out.println("Input String is Palidrome.");
        else
            System.out.println("Input String is not palidrome.");
    }

    private static String reverseInput(String inputText) {
        String reverse = "";
        char[] charArray = inputText.toCharArray();
        for (int i = inputText.length()-1; i>=0 ; i--) {
            reverse +=charArray[i];
        }
        return reverse;
    }

}
