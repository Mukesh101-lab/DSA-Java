public class BinarySearch {
    public static int binSearch(int arr[],int key){
        int start = 0 , end = arr.length-1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == key) return mid;
            else if(arr[mid] > key ) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14};
        int key = 6;
        System.out.println("element found at index : "+binSearch(arr, key));
    }
}
