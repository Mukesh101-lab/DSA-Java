package Functions;

public class BinaryToDecimal {
    public static int calBinToDec(int n){
        int dec = 0;
        int pow = 0;
        
        while (n != 0) {
            int LD = n % 10;
            dec = dec + LD *(int) Math.pow(2, pow);
            n = n / 10;
            pow++;
        }
        return dec;
    }
    public static void main(String[] args) {
        System.out.println(calBinToDec(101));
    }
}
