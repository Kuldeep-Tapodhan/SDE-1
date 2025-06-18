package Week3;

public class sqrt {
    public int mySqrt(int x) {
        if(x==0) return 0;
        for(int i=1;i<=x;i++){
            if(i*i==x){
                return i;
            }
            if(i>x/i){
                return i-1;
            }
        }
        return -1;
    }

    public int optimizemySqrt(int x) {
        if (x == 0) return 0;
        int left = 1;
        int right = x;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                left = mid + 1;
                result = mid;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
