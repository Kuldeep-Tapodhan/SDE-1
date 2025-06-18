package Week1;

public class replace_chalk {

    public static int chalkReplacer(int[] chalk, int k) {
        long sum = 0;

        for (int num : chalk) {
            sum += num;
        }

        k %= sum;

        for (int i = 0; i < chalk.length; i++) {
            if (k < chalk[i]) {
                return i;
            }
            k -= chalk[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] chalk = {3, 4, 1, 2};
        int result = chalkReplacer(chalk, 25);
        System.out.println(result);
    }
}
