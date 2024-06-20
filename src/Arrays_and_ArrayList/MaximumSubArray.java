package Arrays_and_ArrayList;

public class MaximumSubArray {
    public static void main(String[] args) {

    }

    /*
    https://leetcode.com/problems/maximum-subarray/description/
     */
    public int maxSubArray(int[] nums) {
        int currSum=0;
        int maxSum=nums[0];
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            if(currSum>maxSum){
                maxSum=currSum;
            }
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }

    /*
    https://www.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/0


    Given an array Arr, with indexes running from 0 to N-1, select any two indexes, i and j such that i<=j-1.
     From subarray Arr[i...j], find the two smallest numbers and add them,
     you will get score for that subarray. Your task is to return maximum score possible in the given array Arr
     */

    public static long pairWithMaxSum(long arr[], long N)
    {
        // Your code goes here
        long sum = Long.MIN_VALUE;
        long max = Long.MIN_VALUE;
        for (int i = 0; i < N-1; i++){
            sum = arr[i] + arr[i+1];
            if(sum > max){
                max = sum;
            }

        }
        return max;
    }

}
