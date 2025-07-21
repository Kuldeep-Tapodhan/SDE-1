package Week5;

import static extra.helping.swap;

public class Reverse_letters_of_words_in_stentence {


    static int[] reverse(int[] rev){
        int n=rev.length-1;
        int i=0;
        swap(rev,i,n);

        return rev;
    }

    static  void reeverseletteres(int[][] arr){
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=reverse(reverse(arr[i]));
        }
    }

    public static String reverseWords(String str) {
        String s = "", ans = "";
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == ' ') {
                ans += s + " ";
                s = "";
            } else {
                s = ch + s;
            }
        }
        ans += s;
        return ans;
    }


    public static void main(String[] args) {
        String s= "fox jumps on the moon";
//        String[] words = s.split(" ");
//
//        for (int i = 0; i < words.length; i++) {
//            words[i] = new StringBuilder(words[i]).reverse().toString();
//        }
//
//        String reversedSentence = String.join(" ", words);
//        System.out.println(reversedSentence);

        System.out.println(reverseWords(s));

    }
}
