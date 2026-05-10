package Functions;

public class FactorialOfNumber {
    public static int calFact(int n){
        int fact = 1;
        while (n > 0) {
            fact *= n;
            n--;
        }
        return fact;
    } 

    public static void binCoffi(int n ,int r){
        int a = calFact(n);
        int b = calFact(r);
        int aMb = calFact(n - r);

        int binCofficient = a / (b * aMb );
        System.out.println(binCofficient);
    }
    public static void main(String[] args) {
        // int n = 10;
        // System.out.println(calFact(4));
        binCoffi(10, 5);
    }
}
