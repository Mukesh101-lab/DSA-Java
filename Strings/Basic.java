package Strings;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // System.out.println(str);

        String name = "Mukesh Patel";
        System.out.println(name.length());
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
        System.out.println();
        String first = "MUkesh";
        String last = "Patel";

        System.out.println(first +" "+ last);

    }
}
