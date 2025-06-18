package Week1;

public class reverse_digit {
    public static int reverseDigits(int n) {
        // Code here
        int digit = 0;
        while (n > 0) {

            int remainder = n % 10;
            digit = digit * 10 + remainder;
            n /= 10;
        }
        return digit;

    }

    public static void main(String[] args) {
        int numToReverse = 12345;
        System.out.println("Reverse of " + numToReverse + ": " + reverseDigits(numToReverse));
    }
}
