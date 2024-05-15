package Arrays_and_ArrayList;

import java.util.Arrays;

public class Swap_an_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int start=0;
        int end=arr.length-1;
        reverse(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr,int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
