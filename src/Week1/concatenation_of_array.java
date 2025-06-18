package Week1;

import static Week1.day1_2.printarr;

public class concatenation_of_array {
    public static int[] getConcatenation(int[] nums) {

        int j=nums.length;
        int[] ans= new int[2*j];
        for(int i=0;i<j;i++){
            ans[i]=nums[i];
            ans[i+j]=nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] ar={1,2,3,4,5};
        int[] ans = getConcatenation(ar);
        printarr(ans);
    }
}
