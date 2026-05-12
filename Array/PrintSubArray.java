package Array;

public class PrintSubArray {
    public static void printSub(int arr[]){
        int Ts = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                Ts++;
                System.out.println();
            }
        }
        System.out.println("Total Sub Array : "+Ts);
    }

    public static void CalSum(int arr[]){
        System.out.println("Sum of Sub Array : ");
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum = 0;
                // max = Integer.MIN_VALUE;
                for(int k=i;k<=j;k++){
                    sum += arr[k];
                    if(max < sum){
                        max = sum;
                    }
                }
                System.out.println(sum);
            }
        }
        System.out.println("sum of max number : "+max);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printSub(arr);
        CalSum(arr);
    }
}
