package ArrayQustion;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,5,8,-3};
        int target = 2;

        // method 1 
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i] + arr[j] == target){
        //             System.out.print("index : "+i+" , "+j);
        //         }
        //     }
        // }

        //method 2
        int i = 0 , j = arr.length-1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if( sum == target){
                System.out.print("index : "+i+" , "+j);
                break;
            }
            else if(sum > target) j--;
            else i++;
        }
    }
}
