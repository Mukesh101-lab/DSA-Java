package binarySearch;

public class firstOccurance {
    public static int firstOccuranceBin(int arr[] , int tar){
        int lo = 0, hi = arr.length-1 , idx = -1;
        while (lo <= hi) {
            int mid = (lo + hi)/2;
            if(arr[mid] > tar) hi = mid - 1;
            else if(arr[mid] < tar) lo = mid + 1;
            else { //arr[mid] == tar
                idx = mid;
                hi = mid - 1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,6,6,6,7,8};
        int tar = 6;
        int res = firstOccuranceBin(arr, tar);
        System.out.println("first target element at index : "+res);
    }
}
