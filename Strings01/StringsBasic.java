package Strings01;

import java.util.Scanner;

public class StringsBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        // String str = "Mukesh a good Boy";
        // System.out.println(str);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'e' ){
                System.out.println(str.charAt(i));
                count++;
            }
        }
        System.out.println(count);
    }
}
