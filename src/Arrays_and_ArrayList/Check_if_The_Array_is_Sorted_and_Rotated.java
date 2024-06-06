package Arrays_and_ArrayList;
//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
public class Check_if_The_Array_is_Sorted_and_Rotated {
    public static void main(String[] args) {

    }

    public static boolean check(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length]){
                count++;
            }
            if(count>1){
                return false;
            }
        }
        return true;
    }
}
