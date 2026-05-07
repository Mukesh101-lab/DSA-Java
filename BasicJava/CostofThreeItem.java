import java.util.*;

public class CostofThreeItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencile = 5;
        float pen = 10;
        float eraser = 5;
        System.out.println("How Many Pen : ");
        float a = sc.nextFloat();
        System.out.println("How Many pencile : ");
        float b = sc.nextFloat();
        System.out.println("How Many Eraser : ");
        float c = sc.nextFloat();
        pen = pen * a;
        pencile = pencile * b;
        eraser = eraser * c;
        float totelCost =(pencile + pen + eraser) + ((pencile + pen + eraser) * (18f /100));
        System.out.println("Totel cost of with 18 % GST : " + totelCost);
    }
}
