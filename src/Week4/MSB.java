package Week4;

public class MSB {
    public static int getMSB(int n) {
        int pos = -1;
        while (n > 0) {
            n >>= 1; // equal to divide by 2....
            pos++;
        }
        return pos;
    }



    public static void main(String[] args) {
        int n = 69;
        System.out.println("MSB position: " + getMSB(n));
    }
}
