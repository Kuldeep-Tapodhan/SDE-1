package Week1;

import static Week1.day1_2.printarr;

public class day3hw {

    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static int maxProfit(int[] prices) {
        int max=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]-prices[i]>max){
                    max=prices[j]-prices[i];
                }
            }
        }
        return max;
    }

    public static int maxProfitoptmize(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }

    public static int smallestEvenMultiple(int n) {
        return (n % 2 == 0) ? n : n * 2;
    }

    // In case printarr is not implemented, here is a simple version:
    public static void printarr(int[] arr) {
        if(arr.length == 0) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        // Test twoSum
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        System.out.print("twoSum result: ");
        int[] result = twoSum(nums, target);
        printarr(result);

        // Test maxProfit (brute force)
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("maxProfit (brute force): " + maxProfit(prices1));

        // Test maxProfitoptmize (optimized)
        System.out.println("maxProfitoptmize (optimized): " + maxProfitoptmize(prices1));

        // Test smallestEvenMultiple
        int n1 = 6;
        int n2 = 7;
        System.out.println("smallestEvenMultiple of " + n1 + ": " + smallestEvenMultiple(n1));
        System.out.println("smallestEvenMultiple of " + n2 + ": " + smallestEvenMultiple(n2));
    }
}
