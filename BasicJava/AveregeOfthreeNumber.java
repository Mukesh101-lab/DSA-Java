

import java.util.Scanner;
public class AveregeOfthreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a = ");
        int a = sc.nextInt();
        System.out.print("enter b = ");
        int b = sc.nextInt();
        System.out.print("enter c = ");
        int c = sc.nextInt();
        int avg = (a + b + c) / 3;
        System.out.println("Averege of " + a + " and " + b + " and " + c +" is : " + avg);
    }
}
