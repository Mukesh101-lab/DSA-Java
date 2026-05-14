package Array;

public class KadanesAlgorithm {
    public static void CalSubArrayMax(int arr[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            cs = cs + arr[i];
            if(cs < 0){
                cs = 0;
            }
            if(cs > ms ){
                ms = cs;
            }
        }
        System.out.println("Max sub array sum : "+ms);
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        CalSubArrayMax(arr);
    }
}
