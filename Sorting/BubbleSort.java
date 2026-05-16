package Sorting;

public class BubbleSort {
    public static void BubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            boolean swap = false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(swap == false){
                break;
            }
        }
    }
    public static void printBubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        BubbleSort(arr);
        printBubbleSort(arr);
    }
}
