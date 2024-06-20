package Arrays_and_ArrayList;

public class MaximumSubArray {
    public static void main(String[] args) {

    }
    public int maxSubArray(int[] nums) {
        int currSum=0;
        int maxSum=0;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            if(currSum>maxSum){
                maxSum=currSum;
            }

        }
    }
}
