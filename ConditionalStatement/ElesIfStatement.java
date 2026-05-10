package ConditionalStatement;

import java.util.Scanner;

public class ElesIfStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age > 18){
            System.out.println("you can vote");
        }else if (age > 13 && age < 18) {
            System.out.println("tenager");
        }else{
            System.out.println("child age");
        }
    }
}
