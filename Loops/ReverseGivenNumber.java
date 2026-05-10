package Loops;

public class ReverseGivenNumber {
    public static void main(String[] args) {
        int n = 16082002;
        int rem = 0;

        while (n != 0) {
            int LD = n % 10;
            rem = rem * 10 + LD;
            n = n / 10;
        }

        System.out.println(rem +" ");
    }
}
