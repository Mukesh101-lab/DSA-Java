public class largestNumber{
    public static int printLagNum(int arr[]){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[] = {1,2,6,3,5};
        System.out.print("largest Number : "+printLagNum(arr));
    }
}