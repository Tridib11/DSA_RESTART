package Arrays_and_ArrayList;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {
        int j=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[j++]=nums[i+1];
            }
        }
        return j;
    }
}
