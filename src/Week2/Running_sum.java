package Week2;

public class Running_sum {
    public static int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+ nums[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] result = runningSum(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
