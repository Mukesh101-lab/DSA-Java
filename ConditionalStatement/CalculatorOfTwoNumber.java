package ConditionalStatement;

import java.util.Scanner;

public class CalculatorOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("enter a : ");
        int a = sc.nextInt();
        System.out.print("enter b : ");
        int b = sc.nextInt();
        System.out.print("enter operator : ");
        char ch = sc.next().charAt(0);
        switch (ch) {
            case '+':
                System.out.print(a + b);
                break;
            case '-':
                System.out.print(a - b);
                break;
            case '*':
                System.out.print(a * b);
                break;
            case '/':
                System.out.print(a / b);
                break;
            case '%':
                System.out.print(a % b);
                break;
        
            default:
                System.out.println("default operator");
                break;
        }
    }
}
