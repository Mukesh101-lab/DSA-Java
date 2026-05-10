package ConditionalStatement;

public class PrintLargestOfThreeNumber {
    public static void main(String[] args) {
        int a = 50;
        int b = 100;
        int c = 15;
        if(a > b && a > c){
            System.out.println("a is large");
        }else if(b > c){
            System.out.println("b is large");
        }else{
            System.out.println("c is large");
        }
    }
}
