package Functions;

public class CheckPrimeNumber {

    public static boolean CheckPrime(int n) {

        if (n == 2) {
            return true;
        }

        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // range print
    public static void printRangePrime(int n) {

        for (int i = 2; i <= n; i++) {

            if (CheckPrime(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        printRangePrime(10);
    }
}