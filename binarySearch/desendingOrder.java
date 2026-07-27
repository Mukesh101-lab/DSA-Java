package binarySearch;

public class desendingOrder {
    public static int binSearch(int arr[] , int tar){
        int lo = 0 , hi = arr.length-1;
        while(lo <= hi){
            int mid = (lo + hi)/2;
            if(arr[mid] == tar) return mid;
            else if(arr[mid] > tar) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,8,6,4,2};
        int tar = 8;
        int idx = binSearch(arr, 2);
        System.out.println("index found at index : "+idx);
    }
}
