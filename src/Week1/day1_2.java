package Week1;

import java.util.Vector;

public class day1_2 {

    public static int seriesSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int reverseDigits(int n) {
        int digit = 0;
        while (n > 0) {
            int remainder = n % 10;
            digit = digit * 10 + remainder;
            n /= 10;
        }
        return digit;
    }

    public static int maxelemtent(int[] arrr) {
        int n = arrr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arrr[i] > max) {
                max = arrr[i];
            }
        }
        return max;
    }

    public static boolean armstrongNumber(int n) {
        int orig = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += Math.pow(rem, 3);
            n /= 10;
        }
        return sum == orig;
    }

    public static boolean isPalindrome(int n) {
        int digit = 0;
        int original = n;
        while (n > 0) {
            int remainder = n % 10;
            digit = digit * 10 + remainder;
            n /= 10;
        }
        return original == digit;
    }

    public static Integer mexelementve(Vector<Integer> v) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < v.size(); i++) {
            Integer val = v.get(i);
            if (val > max) {
                max = val;
            }
        }
        return max;
    }

    public static void reversevector(Vector<Integer> v) {
        int i = 0;
        int j = v.size() - 1;
        while (i < j) {
            Integer temp = v.get(i);
            v.set(i, v.get(j));
            v.set(j, temp);
            i++;
            j--;
        }
    }

    public static void roatearray(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
        }
    }

    public static void roatearraynshift(int[] arr, int n) {
        for (int k = 0; k < n; k++) {
            for (int i = arr.length - 1; i > 0; i--) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
        }
    }

    public static void rotateVector(Vector<Integer> vec) {
        for (int i = vec.size() - 1; i > 0; i--) {
            int temp = vec.get(i);
            vec.set(i, vec.get(i - 1));
            vec.set(i - 1, temp);
        }
    }

    public static void listofarmstrong(int n) {
        for (int i = 1; i <= n; i++) {
            int orig = i;
            int sum = 0;
            int mn = i;
            int digit = 0;
            while (mn > 0) {
                mn /= 10;
                digit++;
            }
            mn = i;
            while (mn > 0) {
                int rem = mn % 10;
                sum += (int) Math.pow(rem, digit);
                mn /= 10;
            }
            if (orig == sum) {
                System.out.print(orig + "\t");
            }
        }
    }

    public static boolean isprime(int n) {
        if (n == 1||n==0) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean optimizeprime(int n) {
        if (n == 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void listofprime(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.print(i + "\t");
            }
        }
    }

    public static void printarr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " \t");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // 1. seriesSum
        int n = 5;
        System.out.println("Sum of series 0 to " + n + ": " + seriesSum(n));

        // 2. reverseDigits
        int numToReverse = 12345;
        System.out.println("Reverse of " + numToReverse + ": " + reverseDigits(numToReverse));

        // 3. maxelemtent
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Max element in array: " + maxelemtent(arr));

        // 4. armstrongNumber
        int armNum = 153;
        System.out.println(armNum + " is Armstrong? " + armstrongNumber(armNum));

        // 5. isPalindrome
        int palNum = 12321;
        System.out.println(palNum + " is Palindrome? " + isPalindrome(palNum));

        // 6. mexelementve (Vector)
        Vector<Integer> vector = new Vector<Integer>(5);
        vector.add(3);
        vector.add(2);
        vector.add(13);
        vector.add(6);
        vector.add(5);
        System.out.println("Max element in vector: " + mexelementve(vector));

        // 7. reversevector
        System.out.println("Vector before reverse: " + vector);
        reversevector(vector);
        System.out.println("Vector after reverse: " + vector);

        // 8. roatearray
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.print("Array before rotate: ");
        printarr(arr2);
        roatearray(arr2);
        System.out.print("\nArray after one right rotate: ");
        printarr(arr2);
        System.out.println();

        // 9. roatearraynshift
        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.print("Array before 3 right rotates: ");
        printarr(arr3);
        roatearraynshift(arr3, 3);
        System.out.print("\nArray after 3 right rotates: ");
        printarr(arr3);
        System.out.println();

        // 10. rotateVector
        Vector<Integer> vec2 = new Vector<Integer>();
        vec2.add(1); vec2.add(2); vec2.add(3); vec2.add(4);
        System.out.println("Vector before rotate: " + vec2);
        rotateVector(vec2);
        System.out.println("Vector after one right rotate: " + vec2);

        // 11. listofarmstrong
        System.out.print("Armstrong numbers up to 155: ");
        listofarmstrong(155);
        System.out.println();

        // 12. isprime
        int primeTest = 29;
        System.out.println(primeTest + " is prime? " + isprime(primeTest));

        // 13. optimizeprime
        System.out.println(primeTest + " is prime (optimized)? " + optimizeprime(primeTest));

        // 14. listofprime
        System.out.print("Primes up to 30: ");
        listofprime(30);
        System.out.println();

        // 15. printarr
        int[] arr4 = {10, 20, 30};
        System.out.print("Printing array: ");
        printarr(arr4);
        System.out.println();
    }
}
