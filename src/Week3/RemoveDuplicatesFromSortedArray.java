package Week3;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int uniq=0;
        for (int i = 1; i <nums.length ; i++) {
            if (nums[uniq]!=nums[i]){
                uniq++;
                nums[uniq]=nums[i];

            }
        }
    return uniq+1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        int newLength = removeDuplicates(nums);
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        scanner.close();
    }
}

