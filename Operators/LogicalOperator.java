package Operators;

public class LogicalOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println((a > b) && (b > a));
        System.out.println((a > b) || (b > a));
        System.out.println(a != b);
    }
}
