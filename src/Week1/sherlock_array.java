package Week1;

import java.util.Arrays;
import java.util.List;

public class sherlock_array {
    public static String balancedSums(List<Integer> arr) {
        int total = 0;
        for (int i = 0; i < arr.size(); i++) {
            total += arr.get(i);
        }
        int left = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (left == total - left - arr.get(i)) {
                return "YES";
            }
            left += arr.get(i);
        }
        return "NO";
    }

    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(1, 2, 3);
        List<Integer> arr2 = Arrays.asList(1, 2, 3, 3);
        List<Integer> arr3 = Arrays.asList(2, 0, 0, 0);

        System.out.println(balancedSums(arr1));
        System.out.println(balancedSums(arr2));
        System.out.println(balancedSums(arr3));
    }
}