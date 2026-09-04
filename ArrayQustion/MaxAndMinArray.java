package ArrayQustion;
import java.util.*;

public class MaxAndMinArray {
    public static void main(String[] args) {
        int[] arr = {5,-6,5,-1,10,-3};
        Arrays.sort(arr);

        for(int ele : arr){
            System.out.print(ele +" ");
        }
        System.out.println();

        //maximum element in array
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max) max = arr[i];
        }
        System.out.println("maximum element in array : "+max);

        System.out.println();

        //minimum element in array
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min) min = arr[i];
        }
        System.out.println("minimum element in array : "+min);
    }
}
