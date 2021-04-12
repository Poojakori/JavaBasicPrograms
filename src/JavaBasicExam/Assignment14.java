package JavaBasicExam;

public class Assignment14 {
    static void printAboveAvg(int arr[], int n)
    {

        double avg = 0;
        for (int i = 0; i < n; i++)
            avg += arr[i];
        avg = avg / n;
        System.out.println("Average="+avg);
        System.out.println("Numbers which are greater than said array is :");
        for (int i = 0; i < n; i++)
            if (arr[i] > avg)
                System.out.print(arr[i] + " ");

    }

    public static void main (String[] args)
    {
        int arr[] = { 1, 4, 20, 7, 25, 35, 100 };
        int l = arr.length;
        printAboveAvg(arr, l);

    }
}
