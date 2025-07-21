package Week5;

import java.util.HashMap;
import java.util.Hashtable;

public class Roman_To_Integer {

    public static int romanToInt(String s) {
        HashMap<Character,Integer> romtoint = new HashMap<>();
        romtoint.put('I',1);
        romtoint.put('V',5);
        romtoint.put('X',10);
        romtoint.put('L',50);
        romtoint.put('C',100);
        romtoint.put('D',500);
        romtoint.put('M',1000);
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            int current = romtoint.get(s.charAt(i));
            int next = romtoint.get(s.charAt(i + 1));
            if (current >next) {
                ans -= current;
            } else {
                ans += current;
            }
        }

        ans += romtoint.get(s.charAt(n - 1));

        return ans;
    }





    public static void main(String[] args) {
        String roman = "III";
        System.out.println("Integer value: " + romanToInt(roman));


    }
}
