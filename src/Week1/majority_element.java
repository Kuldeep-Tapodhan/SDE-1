package Week1;

import java.util.HashMap;

public class majority_element {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int n = nums.length;
        for (int num : nums) {
            int count = countMap.getOrDefault(num, 0) + 1;
            if (count > n / 2) {
                return num;
            }
            countMap.put(num, count);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums1));
        System.out.println(majorityElement(nums2));
    }
}
