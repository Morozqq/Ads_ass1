import java.sql.SQLOutput;

public class Main {

    // Task 1
    private static int findMinIter(int[] arr, int i, int min) {
        if (i == arr.length) return min;
        if (arr[i] < min) min = arr[i];
        return findMinIter(arr, i + 1, min);
    }

    public static int findMin(int[] arr) {
        return findMinIter(arr, 0, arr[0]);
    }

    // Task 2
    private static int calculateSum(int[] arr, int i) {
        if (i == arr.length) return 0;
        return arr[i] + calculateSum(arr, i+1);
    }

    public static double findAverage(int[] arr) {
        return (double)calculateSum(arr, 0)/(arr.length);
    }

    // Task 3
    private static boolean isPrimeIter(int number, int i) {
        if (i < 2) return true;
        if (number % i == 0) return false;
        else return isPrimeIter(number, i-1);
    }

    public static boolean isPrime(int number) {
        return isPrimeIter(number, number-1);
    }

    // Task 4
    public static int factorial(int number) {
        if (number == 1) return number;
        return number * factorial(number-1);
    }

    // Task 5
    public static int fib(int number) {
        if (number <= 2) return 1;
        return fib(number-1) + fib(number-2);
    }

    // Task 6
    public static int power(int number, int deg) {
        if (deg == 0) return 1;
        return number * power(number, deg-1);
    }

    // Task 8
    private static boolean consistsOfDigitsIter(char[] s, int i) {
        if (i == s.length) {
            return true;
        }

        if (s[i] <= '9' && s[i] >= '0') {
            return consistsOfDigitsIter(s, i+1);
        } else {
            return false;
        }
    }

    public static void consistsOfDigits(String str) {
        char[] s = str.toCharArray();
        if (consistsOfDigitsIter(s, 0)) System.out.println("Yes");
        else System.out.println("No");
    }

    public static void main(String[] args) {

        consistsOfDigits("1234d");

    }
}
    //Task 9
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            int c1 = binomialCoefficient(n - 1, k - 1);
            int c2 = binomialCoefficient(n - 1, k);
            return c1 + c2;
        }
    }
    //Task 10
    public static int euclideanGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return euclideanGCD(b, a % b);
        }
    }
