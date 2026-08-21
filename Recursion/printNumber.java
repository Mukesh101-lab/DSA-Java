package Recursion;

public class printNumber {
    // static void print(int n){
    //     if(n == 0) return ;
    //     System.out.println(n);
    //     print(n - 1);
    //     if(n!=1) System.out.println(n);
    // }

    static void print(int n){
        if(n == 0) return ;
        print(n - 1);
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        print(5);
    }
}
