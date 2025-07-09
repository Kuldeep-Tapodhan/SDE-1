package Week5;

public class MissingNumberInArray {


    public static int missingNumber(int[] nums) {
        int n=nums.length;
        int sumrange=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sumrange-sum;

    }

    public static int findMissingXOR(int[] arr) {
        int xor = 0;
        for (int i = 0; i <= arr.length; i++) {
            xor ^= i;
            if (i < arr.length) {
                xor ^= arr[i];
            }
        }
        return xor;
    }


    public static void main(String[] args) {
        int[] arr={4,5,3,1,0,2};
        System.out.println(missingNumber(arr));
        System.out.println(findMissingXOR(arr));
    }
}
