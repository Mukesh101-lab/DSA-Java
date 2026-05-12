package Array;

public class LargestNumber {
    public static int LarNumber(int arr[]){
        int largest = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14};

        int large = LarNumber(arr);

        System.out.println("Largest Number : "+large);
    }
}
