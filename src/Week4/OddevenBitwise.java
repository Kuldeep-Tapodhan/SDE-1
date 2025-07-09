package Week4;

public class OddevenBitwise {



    public static void odd_even(int n){
        if((n&1)==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }

    public static boolean odd_even2(int n){
        int n2=(n/2)*2;
        if (n==n2) return true;
        return false;
    }


    public static void main(String[] args) {
        odd_even(44);
        System.out.println(odd_even2(44));
    }
}
