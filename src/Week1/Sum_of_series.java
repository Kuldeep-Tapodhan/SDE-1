package Week1;

import java.util.Scanner;

public class Sum_of_series {
    public static int seriesSum(int n) {
        int sum=0;// code here
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of series 0 to " + n + ": " + seriesSum(n));
    }
}
