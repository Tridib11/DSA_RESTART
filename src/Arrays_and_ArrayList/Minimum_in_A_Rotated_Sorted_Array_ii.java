package Arrays_and_ArrayList;

import java.util.*;
public class Minimum_in_A_Rotated_Sorted_Array_ii {
  public static void main(String[] args) {
    
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
        
      }
     }   
  }
}
