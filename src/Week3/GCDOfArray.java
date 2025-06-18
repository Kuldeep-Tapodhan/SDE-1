package Week3;

public class GCDOfArray {
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static int findGCD(int[] nums) {
        int i=1;
        int smallest=nums[0];
        int largest=nums[0];
        while(i<nums.length){
            if(nums[i]>smallest){
                smallest=nums[i];
            }
            if(nums[i]<largest){
                largest=nums[i];
            }
            i++;
        }
        return gcd(smallest,largest);
    }

    public static void main(String[] args) {
          int[] arr ={2,5,6,9,10};
        System.out.println(findGCD(arr));
    }
}
