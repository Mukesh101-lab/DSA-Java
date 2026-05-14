package Array;

public class PrefixSubArraySum {
    public static void CalPrefixSubArraySum(int arr[]) {

    int prefix[] = new int[arr.length];

    prefix[0] = arr[0];

    // Prefix Array
    for(int i = 1; i < arr.length; i++) {
        prefix[i] = prefix[i - 1] + arr[i];
    }
    int maxSum = Integer.MIN_VALUE;
    for(int i = 0; i < arr.length; i++) {
        for(int j = i; j < arr.length; j++) {
            int currSum;
            currSum = (i == 0)? prefix[j] : prefix[j] - prefix[i - 1];
            if(currSum > maxSum) {
                maxSum = currSum;
            }
        }
    }

    System.out.println("max sub array sum : " + maxSum);
}
      
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        CalPrefixSubArraySum(arr);
    }
    
}
