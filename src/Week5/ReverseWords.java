package Week5;

public class ReverseWords {

    public static String reverseword(String s) {
        String ans = "";
        String sub = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                ans += reverse(sub) + " ";
                sub = "";
            } else {
                sub += ch;
            }
        }

        // Add the last word
        ans += reverse(sub);
        return ans;
    }

    public static String reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        String s = "fox jumps on the moon";
        System.out.println(reverseword(s));
    }
}
