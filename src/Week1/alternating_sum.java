package Week1;

public class alternating_sum {
    public static int alternateDigitSum(int n) {
        int pow = 1, temp = n;
        while (temp >= 10) {
            temp /= 10;
            pow *= 10;
        }
        int sum = 0, sign = 1;
        while (pow > 0) {
            int digit = n / pow;
            sum += sign * digit;
            n %= pow;
            pow /= 10;
            sign *= -1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(alternateDigitSum(5121));
    }
}
