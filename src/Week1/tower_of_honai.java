package Week1;

import java.util.Scanner;

public class tower_of_honai {
    // This method works until n=31 ,if n>31 it will crash due to memory shoratage
    static int steps(int n){
        if (n==0) return 0;
        return  2*steps(n-1)+1;
    }

    //using formula

    static  int  steps1(int n){
        return (int) (Math.pow(2,n)-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long startTime = System.nanoTime();

        int result = steps(n);
        System.out.println(result);

        // End time measurement
        long endTime = System.nanoTime();

        // Calculate elapsed time in milliseconds
        double elapsedTimeMs = (endTime - startTime) / 1_000_000.0;
        System.out.printf("Time taken: %.4f ms\n", elapsedTimeMs);
    }
}
