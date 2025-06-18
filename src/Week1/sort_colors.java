package Week1;

import static Week1.day1_2.printarr;

public class sort_colors {
    public static void sortColors(int[] arr) {
        int zeros = 0, ones = 0, twos = 0;
        for (int num : arr) {
            if (num == 0) zeros++;
            else if (num == 1) ones++;
            else twos++;
        }
        int i = 0;
        for (int j = 0; j < zeros; j++) arr[i++] = 0;
        for (int j = 0; j < ones; j++) arr[i++] = 1;
        for (int j = 0; j < twos; j++) arr[i++] = 2;
    }

    public static void main(String[] args) {
        int[] ars = {2, 0, 2, 1, 1, 0};
        printarr(ars);

        sortColors(ars);
        System.out.println();
        printarr(ars);
    }
}
