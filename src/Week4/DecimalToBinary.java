package Week4;

import java.util.ArrayList;

public class DecimalToBinary {

    public static ArrayList<Integer> binary(int n){
        ArrayList<Integer> list = new ArrayList<>();
        while (n>0){
            list.add(n%2);
            n/=2;
        }
        return list;
    }
    public static void   countbits(ArrayList<Integer> list){
        int i=0;
        int count=0;
        while (i<list.size()){
            count++;
        }
        System.out.println(count);
    }




    public static  void printbinary(ArrayList<Integer> list){
        for (int i =list.size()-1; i >=0 ; i--) {
            System.out.print(list.get(i)+"\t");
        }
    }
    public static void main(String[] args) {
        printbinary( binary(11));
        countbits(binary(1000));

    }
}
