package Week2;

public class TwoDBinarysearch {

    // Brute-force search
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // Optimized binary search
    public boolean optimizesearchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = matrix[mid / n][mid % n];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TwoDBinarysearch searcher = new TwoDBinarysearch();

        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target1 = 3;
        int target2 = 13;

        System.out.println("Brute-force search:");
        System.out.println("Target " + target1 + ": " + searcher.searchMatrix(matrix, target1)); // true
        System.out.println("Target " + target2 + ": " + searcher.searchMatrix(matrix, target2)); // false

        System.out.println("\nOptimized binary search:");
        System.out.println("Target " + target1 + ": " + searcher.optimizesearchMatrix(matrix, target1)); // true
        System.out.println("Target " + target2 + ": " + searcher.optimizesearchMatrix(matrix, target2)); // false
    }
}
