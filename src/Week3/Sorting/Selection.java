package Week3.Sorting;

import static extra.helping.displayarr;
import static extra.helping.swap;

public class Selection {

    public  static  void selectionsort(int[] arr){
        int n= arr.length;
        if (arr == null || arr.length == 0) return;
        for (int i = 0; i <n ; i++) {
            int minindex=i;
            for (int j =i+1; j <n ; j++) {
                if (arr[j]<arr[minindex]) {
                    minindex=j;
                }
            }
            swap(arr,i,minindex);
        }
    }

    public static void main(String[] args) {
        int[] array={2,9,3,7,5,3,8,4,5};
        selectionsort(array);
        displayarr(array);
    }
}
