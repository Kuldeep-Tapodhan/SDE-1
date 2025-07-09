package Week4;

public class Swapviabit {


    public  static void swabbit(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        swabbit(10,12);
    }
}
