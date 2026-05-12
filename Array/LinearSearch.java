package Array;

public class LinearSearch {
    public static int LinSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14};
        int key = 10;

        int index = LinSearch(arr, key);

        if(index == -1){
            System.out.println("Index Not Index");
        }else{
                System.out.println("Index Found at Index : "+index);
        }
    }
}
