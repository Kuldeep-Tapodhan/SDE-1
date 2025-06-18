package Week1;
import static java.lang.Math.abs;

public class sqrt {
    static double get_diviation(int n, double root) {
        double est = root * root;
        double diff = abs(n - est);
        double perc_diff = diff / n * 100;
        return perc_diff;
    }

    static double helper(int n, double guess) {
        while (get_diviation(n, guess) > 0.01) {
            System.out.println("Diff:  "+get_diviation(n, guess));
            System.out.println(guess);
            double div = n / guess;
            double avg = (guess + div) / 2.0;
            guess = avg;
        }
        return guess;
    }

    public static void main(String[] args) {

        System.out.println(helper(89, 69));
    }
}
