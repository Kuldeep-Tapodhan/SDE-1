package Week1;

import static Week1.day1_2.printarr;

public class day3 {

    static  void roatearraynshift_Faster(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        int[] tempar= new int[k];


        //first take a backup of last k element
        for (int i = n-k; i <n ; i++) {
            tempar[i-(n-k)]=arr[i];
        }

        //shift intial (n-k) element
        for (int i = n-k-1; i >=0 ; i--){
            arr[i+k]=arr[i];
        }

        //copyy k element to start
        for (int i = 0; i <k ; i++) {
            arr[i]=tempar[i];
        }
    }



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

    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

    public static int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            int j = i + 1;
            while (j < nums.length) {
                if (nums[i] == nums[j]) {
                    count++;
                }
                j++;
            }
        }
        return count;
    }

    public static void sortColors(int[] arr) {
        int zeros = 0, ones = 0, twos = 0;
        for (int num : arr) {
            if (num == 0) zeros++;
            else if (num == 1) ones++;
            else twos++;
        }
        int i = 0;
        for (int j = 0; j < zeros; j++) arr[i++] = 0;
        for (int j = 0; j < ones; j++) arr[i++] = 1;
        for (int j = 0; j < twos; j++) arr[i++] = 2;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        printarr(arr);
        roatearraynshift_Faster(arr,3);
        System.out.println();
        printarr(arr);
        System.out.println();
        System.out.println(alternateDigitSum(512));
        int[] ar={1,2,3,4,5};
        int[] ans = getConcatenation(ar);
        printarr(ans);

        int[] nums = {1, 2, 3, 1, 1, 3};
        int result = numIdenticalPairs(nums);

        System.out.println("\n" + result);

        int[] ars = {2, 0, 2, 1, 1, 0};
        printarr(ars);

        sortColors(ars);
        System.out.println();
        printarr(ars);


    }
}
