package Patterns;

public class Traingles {

    public static void reversehalf(int n){
        for (int i = 0; i <n ; i++) {

            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <n-i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void  perfectTriangle(int n){

        for (int i = 0; i <n ; i++) {

            for (int j = 0; j <n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
            reversehalf(5);
            perfectTriangle(5);
    }
}
