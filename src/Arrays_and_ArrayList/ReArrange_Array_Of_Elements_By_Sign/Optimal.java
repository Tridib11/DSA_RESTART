package Arrays_and_ArrayList.ReArrange_Array_Of_Elements_By_Sign;

//https://leetcode.com/problems/rearrange-array-elements-by-sign/

import java.util.ArrayList;

public class Optimal {
    public static void main(String[] args) {

    }
    public int[] rearrangeArray(int[] nums) {
        int[] ans=new int[nums.length];
        int positiveIndex=0,negativeIndex=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[positiveIndex]=nums[i];
                positiveIndex+=2;
            }
            else{
                ans[negativeIndex]=nums[i];
                negativeIndex+=2;
            }
        }
        return ans;
    }
}
