package Week1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class day4_Maps {


    public static int findMode(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int mode = arr[0];
        int maxCount = 0;


        for (int num : arr) {
            int count = freq.getOrDefault(num, 0) + 1;
            freq.put(num, count);
            if (count > maxCount){
                maxCount = count;
                mode = num;
            }
        }
        return mode;
    }



    public static void main(String[] args) {
        int[] arr = {5, 15, 25, 35, 35, 40, 10};
        System.out.println("Mode: " + findMode(arr));
    }
}