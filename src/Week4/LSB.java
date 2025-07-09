package Week4;

public class LSB {
    public static int getLSB(int n) {
        int pos = 0;
        while ((n & 1) == 0 && n > 0) {
            n >>= 1;
            pos++;
        }
        return pos;
    }
    public static void main(String[] args) {
        int n = 40;
        System.out.println("LSB position: " + getLSB(n));
    }
}
