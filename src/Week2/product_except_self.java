package Week2;

public class product_except_self {
    public static int[] optimixeproductExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        int suff = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * suff;
            suff *= nums[i];
        }
        return answer;
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    product *= nums[j];
                }
            }
            answer[i] = product;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] resultNaive = productExceptSelf(nums);
        for (int num : resultNaive) {
            System.out.print(num + " ");
        }
        System.out.println();
        int[] resultOptimized = optimixeproductExceptSelf(nums);
        for (int num : resultOptimized) {
            System.out.print(num + " ");
        }
    }
}
