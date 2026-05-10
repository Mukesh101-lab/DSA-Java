package Pattern;

public class DiamondPattern {
    public static void main(String[] args) {
        int count =1;
        for(int i=1;i<=4;i++){
            for(int k=3;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=count;j++){
                System.out.print("*");
            }
            count += 2;
            System.out.println();
        }
        int count1 = 7;
        for(int i=4;i>=1;i--){
            for(int k=3;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=count1;j++){
                System.out.print("*");
            }
            count1 -= 2;
            System.out.println();
        }
    }
}
