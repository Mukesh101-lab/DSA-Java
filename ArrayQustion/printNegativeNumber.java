package ArrayQustion;

public class printNegativeNumber {
    public static void main(String[] args) {
        int[] arr = {5,-6,-5,1,10,-3};

        // print negative Number in array
        for(int i=0;i<arr.length;i++){
            if(arr[i] < 0){
                System.out.print(arr[i]+" ");
            }
        }

        System.out.println();
        //print sum of elements of the array
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.print("sum of array elements : "+ sum);

        System.out.println();
        //product of elements of the array
        int product = 1;
        for(int i=0;i<arr.length;i++){
            product *= arr[i];
        }
        System.out.println("Product of array elements : "+product);
    }
}
