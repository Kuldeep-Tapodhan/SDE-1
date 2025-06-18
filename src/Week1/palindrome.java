package Week1;

public class palindrome {
    public static boolean isPalindrome(int n) {
        int digit = 0;
        int original = n;
        while (n > 0) {
            int remainder = n % 10;
            digit = digit * 10 + remainder;
            n /= 10;
        }
        return original == digit;
    }

    public static void main(String[] args) {
        int palNum = 12321;
        System.out.println(isPalindrome(palNum));
    }
}
