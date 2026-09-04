package ArrayQustion;

public class RotateArray {
    public static void rotate(int i , int j , int[] arr){
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d = 2;
        int n = arr.length;
        rotate(0 , d-1 , arr);
        rotate(d , n-1 , arr);
        rotate(0 , n-1 , arr);

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
