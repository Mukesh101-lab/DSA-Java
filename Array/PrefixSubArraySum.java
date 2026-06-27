public class PrefixSubArraySum {
    public static void maxSum(int arr[]){
        //calculate prefix sum
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        // find max subArray sum
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                System.out.println(sum);
                if(max < sum){
                    max = sum;
                }
            }
        }
        System.out.println("max sub array sum : "+max);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        maxSum(arr);
    }
}
