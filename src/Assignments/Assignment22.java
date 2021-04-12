//
package Assignments;

public class Assignment22 {
    public static void main(String[] args) {
        int n = 100;
        sumOfPrimeNo(n);
    }

    private static void sumOfPrimeNo(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0){
                sum = sum + i;

            }

        }
        System.out.println("Sum of prime numbers:" + sum);
    }
}