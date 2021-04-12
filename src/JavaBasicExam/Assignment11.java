package JavaBasicExam;

import java.util.Scanner;

public class Assignment11 {
    static void findConsecutive(int N)
    {
        int start = 1;
        int end = (N + 1) / 2;

        while (start < end)
        {
            int sum = 0;
            for (int i = start; i <= end; i++)
            {
                sum = sum + i;

                if (sum == N)
                {
                    for (int j = start; j <= i; j++)

                        System.out.print(j + "+");
                    System.out.println();
                    break;
                }

                if (sum > N)
                    break;
            }
            sum = 0;
            start++;
        }
    }

    public static void main (String[] args)
    {
        int N;
        System.out.println("Enter the Number:");
        Scanner in = new Scanner(System.in);
        N= in.nextInt();
        findConsecutive(N);
    }
}
