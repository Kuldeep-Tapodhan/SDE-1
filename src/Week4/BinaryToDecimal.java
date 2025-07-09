package Week4;

public class BinaryToDecimal {
    public static int binaryToDecimal(String b) {
        int decimal=0;
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='1'){
                decimal+=Math.pow(2,b.length()-1-i);
            }
        }
        return decimal;
    }

    public static void main(String[] args) {
        System.out.println(binaryToDecimal("11100110"));
    }
}
