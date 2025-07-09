package Week4;

public class MaxDifference {

        public static int largeArr(int[] arr) {
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr.length; j++) {
                    int diff = Math.abs(arr[i] - arr[j]);
                    if (diff > max) {
                        max = diff;
                    }
                }
            }
            return max;
        }
        public static void main(String[] args) {
            int[] arr = {4, 5, 9, 6};
            System.out.println(largeArr(arr));
        }
    }
