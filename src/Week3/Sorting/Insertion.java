package Week3.Sorting;

import static extra.helping.displayarr;
import static extra.helping.swap;

public class Insertion {


    public static  void insertionsort(int[] arr){
        int  n=arr.length;

        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n ; j++) {
                if (arr[i]>arr[j])swap(arr,i,j);
            }
        }


    }

    public static void main(String[] args) {
        int[] arr={4,3,7,8,6,9,2,1,10};
        insertionsort(arr);
        displayarr(arr);
    }
}
