package Week5;

public class SubsetofArray {

public  static  int[] subset(int[] arr){
    int newl= (int) Math.pow(2, arr.length-1);
    int[] subar= new int[newl];
    return subar;
}
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};
        subset(arr);
    }
}
