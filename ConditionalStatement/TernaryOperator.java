package ConditionalStatement;

import javax.print.DocFlavor.STRING;

public class TernaryOperator {
    public static void main(String[] args) {
        // String large = (5>3)?"even":"odd";
        // System.out.println(large);
        int n = 10;
        boolean num = (n % 2 == 0)? true:false;
        System.out.println(num);
    }
}
