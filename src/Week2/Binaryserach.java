package Week2;

public class Binaryserach {
    static  int Binarserc(int[] arr,int targert,int l,int r){

        if (l>r) return -1;

        int mid=(l+r)/2;

        if (arr[mid]==targert) return mid;

        if (arr[mid]>targert) return Binarserc(arr,targert,0,mid);

        else return Binarserc(arr,targert,mid+1,r);
    }


    static  int linearserch(int n ){


        return  0;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 15;

        int result = Binarserc(arr, target, 0, arr.length - 1);

        System.out.println(result);
    }
}
