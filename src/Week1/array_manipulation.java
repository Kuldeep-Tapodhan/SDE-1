package Week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class array_manipulation {
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long[] arr = new long[n + 2];
        for (List<Integer> query : queries) {
            int a = query.get(0);
            int b = query.get(1);
            int k = query.get(2);
            arr[a] += k;
            arr[b + 1] -= k;
        }
        long max = 0;
        long current = 0;
        for (int i = 1; i <= n; i++) {
            current += arr[i];
            if (current > max) {
                max = current;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Sample input
        int n = 5;
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(Arrays.asList(1, 2, 100));
        queries.add(Arrays.asList(2, 5, 100));
        queries.add(Arrays.asList(3, 4, 100));

        long result = arrayManipulation(n, queries);
        System.out.println(result);
    }
}