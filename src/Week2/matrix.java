package Week2;

import java.util.Scanner;

public class matrix {
static  Scanner sc = new Scanner(System.in);

    static  void arrayprint2D(int[][] mat){
        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j <mat[i].length; j++) {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }

    static  void arrayinputt2D(int[][] mat){
        for (int i = 0; i <mat.length ; i++) {
            for (int j = 0; j <mat[i].length; j++) {
                mat[i][j]=sc.nextInt();
            }

        }
    }

    public static void main(String[] args) {

        int n=2;
        int m=3;
        System.out.println("Enter element:");
        int[][] mat= new int[n][m];
        arrayinputt2D(mat);
        arrayprint2D(mat);





    }
}
