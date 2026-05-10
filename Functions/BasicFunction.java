package Functions;

public class BasicFunction {
    public static void print(){
        System.out.println("Hello Mukesh");
        System.out.println("hello Mukesh");
    }

    public static int sumPrint(int a , int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        print();
        System.out.println(sumPrint(5, 10));
    }
}
