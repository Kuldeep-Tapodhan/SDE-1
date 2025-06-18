package Week1;

import java.util.*;

public class unique_occurences {

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        Set<Integer> freqSet = new HashSet<>();
        for (int count : countMap.values()) {
            if (!freqSet.add(count)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1, 1, 3};
        int[] arr2 = {1, 2};
        System.out.println(uniqueOccurrences(arr1));
        System.out.println(uniqueOccurrences(arr2));
    }
}
