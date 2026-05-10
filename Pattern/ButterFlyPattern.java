package Pattern;

public class ButterFlyPattern {
    public static void main(String[] args) {
        int count = 6;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=count;k>=1;k--){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            count -= 2;
            System.out.println();
        }

        int count1 = 0;
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=count1;k>=1;k--){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            count1 += 2;
            System.out.println();
        }
    }
}
