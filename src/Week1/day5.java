package Week1;

public class day5 {


    static void print1ton(int n) {
        if (n == 0) return;
        print1ton(n - 1);
        System.out.print(n + "\t");

    }

    static void printnto1(int n) {
        if (n == 1) {
            System.out.print(n + "\t");
        } else {
            System.out.print(n + "\t");
            printnto1(n - 1);
        }
    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int fibonaci(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return fibonaci(n - 1) + fibonaci(n - 2);
    }

    static  void listoffibo(int i){
//        for (int j = 0; j <i ; j++) {
//            System.out.print(fibonaci(j)+"\t");
//        }
        if (i==0) return;
        listoffibo(i-1);
        System.out.print(fibonaci(i-1)+"\t");


    }


    public static void main(String[] args) {
        print1ton(10);
        System.out.println();
        printnto1(10);
        System.out.println();
        System.out.println(factorial(5));
        System.out.println(fibonaci(10));
        listoffibo(10);

    }
}
