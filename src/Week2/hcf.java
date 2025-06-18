package Week2;

public class hcf {


/*** suppose second number is greater than then
 the firt then one addtional function will be held as it
 will aouto swap the numbers

 ***/
    public static int gcd(int x,int y){
        if (y==0) return x;
        return gcd(y,x%y);
    }
    public  static  int lcm (int x,int y){

        int h= gcd(x,y);
        return (x*y)/h;

    }

    public static void main(String[] args) {
        System.out.println(gcd(24,36));
        System.out.println(lcm(24,36)   );
    }

}
