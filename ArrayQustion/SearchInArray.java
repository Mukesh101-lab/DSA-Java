package ArrayQustion;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {3,5,11,15,20};
        int found = 11;

        boolean isNumber = false;
        int count = -1;
        for(int i=0;i<arr.length;i++){
            count++;
            if(arr[i] == found) {
                isNumber = true;
                break;
            }
        }

        if(!isNumber) System.out.println("element not exist");
        else System.out.println("element exist at index : "+count);
    }
}
