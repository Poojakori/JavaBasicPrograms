package JavaBasicExam;

import java.util.Arrays;

public class Assignment17 {
    public static void main(String[] args) {
        int[] num = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10};
        System.out.println("Original array: "+ Arrays.toString(num));
        int[] result = partitionArray2(num);
        System.out.println("After partition the said array becomes: " +Arrays.toString(result));
    }



    public static int[] partitionArray2(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            while (nums[i] % 2 == 0) i++;
            while (nums[j] % 2 != 0) j--;
            if (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;
    }
}
