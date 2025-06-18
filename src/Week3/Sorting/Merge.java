package Week3.Sorting;
import static Week1.day1_2.printarr;
public class Merge {

public static void merge(int[] arr,int l,int mid,int r){
    int n1=mid-l+1;
    int n2=r-mid;
    int[] ar1= new int[n1];
    int[] ar2= new int[n2];

    for (int i =0; i <n1 ; i++) {
        ar1[i]=arr[l+i];
    }
    for (int i=0; i <n2 ; i++) {
        ar2[i]=arr[mid+1+i];
    }
    int i=0,j=0,k=l;
    while (i<n1 && j<n2){
        if (ar1[i]<ar2[j]){
            arr[k++]=ar1[i++];
        } else if (ar1[i]>ar2[j]){
            arr[k++]=ar2[j++];
        }
    }
    while (i < n1)
        arr[k++] = ar1[i++];
    while (j < n2)
        arr[k++] = ar2[j++];

}

    public  static  void mergesortt(int[] arr,int l,int r){
        if (l>=r) return;
        int mid=(l+r)/2;
        mergesortt(arr,l,mid);
        mergesortt(arr,mid+1,r);
        merge(arr,l,mid,r);
    }


    public static void main(String[] args) {
        int[] arr = {3, 11, 13, 9, 2};
        int n = arr.length;
        System.out.println("Array before sorting");
        printarr(arr);
        mergesortt(arr, 0, n - 1);
        System.out.println();
        System.out.println("Array after sorting");
        printarr(arr);
    }
}
