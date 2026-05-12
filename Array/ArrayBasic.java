package Array;

import java.util.Scanner;

public class ArrayBasic {
    public static void main(String[] args) {

        //create array
        int arr[] = new int[10];
        // int marks[] = {1,2,3,4,5};
        // char arr1[] = {'a','b','c','d'};
        // String arr2[] = {"Mukesh","Kishan","ajit"};
        
        // for(int i=0;i<arr2.length;i++){
        //     System.out.print(arr2[i]+" ");
        // }

        //input Array
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array element : ");
         for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        //output array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
