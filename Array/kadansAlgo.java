public class kadansAlgo {
    public static void maxSum(int arr[]){
        int cs = 0; 
        int ms = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs += arr[i];
            if(cs < 0 ){
                cs = 0;
            }
            else if(cs > ms){
                ms = cs;
            }
        }
        System.out.print("max subArray sum : "+ms);
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        maxSum(arr);
    }
}
