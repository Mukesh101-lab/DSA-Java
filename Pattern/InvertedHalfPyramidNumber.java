package Pattern;

public class InvertedHalfPyramidNumber {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            int count = 1;
            for(int j=5;j>=i;j--){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
