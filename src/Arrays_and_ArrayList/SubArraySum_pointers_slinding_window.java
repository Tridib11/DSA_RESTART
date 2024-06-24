package Arrays_and_ArrayList;
import java.util.*;


public class SubArraySum_pointers_slinding_window {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 7, 5};
        int S1 = 12;
        int[] result1 = subarray(arr1, S1);
        System.out.println(Arrays.toString(result1));  // Output: [2, 4]

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int S2 = 15;
        int[] result2 = subarray(arr2, S2);
        System.out.println(Arrays.toString(result2));  // Output: [1, 5]
    }


    private static int[] subarray(int[] arr,int s){
        int left=0;
        int right=0;
        int currentSum=0;
        while(right<arr.length){
            currentSum+=arr[right];
            while(currentSum>s && left<=right){
                currentSum-=arr[left];
                left++;
            }
            if(currentSum==s){
                return new int[]{left+1,right+1};
            }
            right++;
        }
        return new int[]{-1,-1};

    }
}
