package Week1;

public class pow {


    private static double mypow(double x, int n) {

        if(n==0) return 1;
        if (n==1){
            return x;
        }
        if (n>1) {
            return   x*mypow(x,n-1);
        }
        return 1 / mypow(x, -n);
    }


    public static double myPow(double x, int n) {
        long N = n; // Handle Integer.MIN_VALUE
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return fastPow(x, N);
    }

    private static double fastPow(double x, long n) {
        if (n == 0) return 1.0;
        double half = fastPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }

    public static void main(String[] args) {
        System.out.printf("%.10f\n", mypow(2, -10));
        System.out.println(myPow(2,-200000000));

    }
}
