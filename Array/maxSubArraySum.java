public class maxSubArraySum {
    public static void maxSum(int arr[]){
        int n = arr.length-1;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<=n;i++){
            for(int j=i;j<=n;j++){
                sum = 0;
                for(int k=i;k<=j;k++){
                    sum += arr[k];
                }
                System.out.println(sum);
                if (sum > max) {
                    max =  sum;
                }
            }
            System.out.println();
        }
        System.out.println("max subArray sum : "+max);
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        maxSum(arr);
    }
}
