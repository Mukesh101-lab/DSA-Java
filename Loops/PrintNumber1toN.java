package Loops;

import java.util.Scanner;

public class PrintNumber1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        while (n >= count) {
            System.out.println(count);
            count++;
        }
    }
}
