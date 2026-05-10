package Pattern;

public class PalindromicPatternNumber {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int l=4;l>=i;l--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            int count = 2;
            for(int k=2;k<=i;k++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
