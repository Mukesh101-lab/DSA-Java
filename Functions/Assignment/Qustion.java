package Functions.Assignment;

public class Qustion {

    //Qustion 1
    public static int AvgThreeNumber(int a , int b , int c){
        return (a + b + c) / 3;
    }

    //qustion 2
    public static boolean isEven(int n){
        if(n % 2 == 0) return true;
        else return false;
    }

    //qustion 3
    public static boolean CheckPali(int n){
        int num = n;
        int rev = 0;
        while (n != 0) {
            int LD = n % 10;
            rev = rev * 10 + LD;
            n = n / 10;
        }
        if(num == rev)  return true;
        else return false;
       
    }

    //Qustion 4
    public static int sumOfDigit(int n){
        int sum = 0;

        while (n != 0) {
            int LD = n % 10;
            sum += LD;
            n = n /10;
        }
        return sum;
    }
    public static void main(String[] args) {
        // System.out.println(AvgThreeNumber(5,10, 15));
        // System.out.println(isEven(5));
        // System.out.println(CheckPali(121));
        System.out.println(sumOfDigit(1245));
    }
}
