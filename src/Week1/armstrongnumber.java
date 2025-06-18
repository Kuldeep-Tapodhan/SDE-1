package Week1;

public class armstrongnumber {
    public static boolean armstrongNumber(int n) {
        int orig = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, 3);
            n /= 10;
        }
        return sum == orig;
    }

    public static void main(String[] args) {
        int armNum = 153;
        System.out.println(armstrongNumber(armNum));
    }
}
