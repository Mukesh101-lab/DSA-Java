public class ReverseArray {
    public static void revNum(int arr[]){
        int s = 0 , e = arr.length-1;
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        revNum(arr);
        System.out.print("reverse element : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
