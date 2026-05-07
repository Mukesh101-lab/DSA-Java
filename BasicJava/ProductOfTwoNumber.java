import java.util.Scanner;

public class ProductOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a : ");
        float a = sc.nextFloat();
        System.out.println("enter b : ");
        float b = sc.nextFloat();
        float Product = a * b ;
        System.out.println("Product of " + a + " and " + b + " is : " +Product);
    }
}
