package ConditionalStatement;

import java.util.Scanner;

public class LeepYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("Leep Year");
        }else{
            System.out.println("Not Leep Year");
        }
    }
}
