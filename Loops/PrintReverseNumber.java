package Loops;

public class PrintReverseNumber {
    public static void main(String[] args) {
        int n = 16082002;
        
        while (n != 0) {
            int Ld = n % 10;
            System.out.print(Ld +" ");
            n = n / 10;
        }
    }
}
