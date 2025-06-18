package Week2;
import java.util.Scanner;

public class greatest_on_right {
    public static int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int m=-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>m){
                    m=arr[j];
                }
            }
            arr[i]=m;
        }
        arr[arr.length-1]=-1;
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int[] result = replaceElements(arr);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}
