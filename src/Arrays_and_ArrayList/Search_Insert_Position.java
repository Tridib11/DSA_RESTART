package Arrays_and_ArrayList;
//https://leetcode.com/problems/search-insert-position/

public class Search_Insert_Position {
  public static void main(String[] args) {


  }
    public static int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) return mid;
            if(target<nums[mid]) end=mid-1;
            else start=mid+1;
        }
        return start;
    }
}
