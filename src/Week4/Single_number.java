package Week4;

import java.util.HashMap;

public class Single_number {


    public static int singleNumberusing_bitwise(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static int singleNumberuisng_Hashmap(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int single = singleNumberusing_bitwise(nums);
        System.out.println("The single number is: " + singleNumberuisng_Hashmap(nums));
        System.out.println("The single number is: " + single);
    }

}
