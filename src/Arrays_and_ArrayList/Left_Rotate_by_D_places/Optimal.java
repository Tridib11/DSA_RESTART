package Arrays_and_ArrayList.Left_Rotate_by_D_places;
//https://leetcode.com/problems/rotate-array/description/
import java.util.Arrays;

public class Optimal {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(rotate(arr,3)));
    }

    public static int[] rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverseNums(nums,0,n-1);
        reverseNums(nums,0,k-1);
        reverseNums(nums,k,n-1);
        return nums;
    }

    private static void reverseNums(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
