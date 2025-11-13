public class PascalTraingleViaFact {
    public static  int fact(int n){
        if (n==0 || n==1) return 1;
        return n*fact(n-1);
    }
    public static  void printPascal(int n){

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                int value = fact(i) / (fact(j) * fact(i - j));
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPascal(5);
    }
}
