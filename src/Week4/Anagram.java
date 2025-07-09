package Week4;

public class Anagram {


    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;
        StringBuilder s1 = new StringBuilder(s);
        StringBuilder s2 = new StringBuilder(t);

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    s1.setCharAt(i, '-');
                    s2.setCharAt(j, '-');
                    break;
                }
            }
        }

        return s1.toString().equals(s2.toString());
    }

    public static boolean optimxze_isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        StringBuilder s1 = new StringBuilder(s);
        StringBuilder s2 = new StringBuilder(t);

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == '-') continue; // already matched
            boolean matched = false;

            for (int j = 0; j < s2.length(); j++) {
                if (s2.charAt(j) == '-') continue; // already matched
                if (s1.charAt(i) == s2.charAt(j)) {
                    s1.setCharAt(i, '-');
                    s2.setCharAt(j, '-');
                    matched = true;
                    break;
                }
            }

            if (!matched) return false; // no match found
        }

        return true;
    }

    public static boolean optimeisAnagram(String s, String t) {
        int n = s.length();
        if (n != t.length()) return false;

        StringBuilder sbT = new StringBuilder(t);

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            boolean matched = false;

            for (int j = 0; j < n; j++) {
                if (sbT.charAt(j) == ch) {
                    sbT.setCharAt(j, '-');
                    matched = true;
                    break;
                }
            }

            if (!matched) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";
        System.out.println(isAnagram(s, t));
        System.out.println(optimeisAnagram(s, t));
    }
}
