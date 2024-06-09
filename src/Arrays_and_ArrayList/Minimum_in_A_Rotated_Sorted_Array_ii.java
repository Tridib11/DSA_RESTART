package Arrays_and_ArrayList;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/

public class Minimum_in_A_Rotated_Sorted_Array_ii {
  public static void main(String[] args) {
    int[] arr={2,2,2,0,1};
    System.out.println(findMin(arr));
  }

  public static int findMin(int[] nums) {
     int start=0,end=nums.length-1,min=Integer.MAX_VALUE;
     while(start<end){
      int mid=start+(end-start)/2;
      if(nums[start]==nums[mid] && nums[mid]==nums[end]){
        min=Math.min(min,nums[mid]);
        start++;
        end--;
      }
      if(nums[start]<=nums[mid]){
        min=Math.min(min,nums[start]);
        start=mid+1;
      }
      else{
        min=Math.min(min,nums[mid]);
        end=mid-1;
      }
     }  
     return min; 

  }
}
