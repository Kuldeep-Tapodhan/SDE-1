package Week3;

import java.util.Scanner;

public class IsPowerof {

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        if(n%2!=0) return false;
        return isPowerOfTwo(n/2);

    }
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        if(n%3!=0) return false;
        return isPowerOfThree(n/3);

    }

    public static boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        if(n%4!=0) return false;
        return isPowerOfFour(n/4);

    }
    public static boolean isPowerOfX(int n,int x) {
        if (n <= 0) return false;
        if (n == 1) return true;
        if(n%x!=0) return false;
        return isPowerOfFour(n/x);

    }



    public static void main(String[] args) {
        System.out.println("Power of 2: " + isPowerOfTwo(16));
        System.out.println("Power of 3: " + isPowerOfThree(27));
        System.out.println("Power of 4: " + isPowerOfFour(64));

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println("Power of " + x + ": " + isPowerOfX(n, x));
    }
}
