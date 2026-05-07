import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter side : ");
        int side = sc.nextInt();
        int AreaOfSquare = side * side;
        System.out.println("Area of Square : "+AreaOfSquare);

    }
}
