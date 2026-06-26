package Array;
import java.util.Scanner;


public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[3];
        // marks[0] = 10;
        // marks[1] = 20;
        // marks[2] = 30;
        
        // System.out.println(marks[1]);

        // String fruits[] = {"apple","mango","banana"};
        System.out.println("intput of number : ");
        for(int i=0;i<marks.length;i++){
            // System.out.println(fruits[i]);
            marks[i] = sc.nextInt();
        }

        System.out.println("output of number " );
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i] + " ");
        }
    }
}
