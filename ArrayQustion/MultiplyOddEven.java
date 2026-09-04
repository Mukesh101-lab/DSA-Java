package ArrayQustion;

public class MultiplyOddEven {
    public static void main(String[] args) {
        int[] arr = {4,1,7,5,-3,10,2};

        for(int i=0;i<arr.length;i++){
            if(i % 2 == 0) arr[i] *= 10;
            else arr[i] += 2;
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
