package ConditionalStatement;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();

        if(income > 1000000){
            System.out.println("30 % tax");
        }else if(income >500000 && income <1000000){
            System.out.println("tax 20 %");
        }else{
            System.out.println("tax 0 %");
        }
    }
}
