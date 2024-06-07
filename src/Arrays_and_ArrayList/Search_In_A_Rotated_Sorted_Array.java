package Arrays_and_ArrayList;

public class Search_In_A_Rotated_Sorted_Array {
  public static void main(String[] args) {
    
  }

  public static int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while(start<=end){
          int mid=start+(end-start)/2;
          if(nums[mid]==target) return mid;
          if(nums[start]<=nums[mid]){
            
          } 
        }
  }
}
