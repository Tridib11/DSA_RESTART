package Arrays_and_ArrayList;

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/


public class Minimum_in_A_Rotated_Sorted_Array {
  public static void main(String[] args) {

  }

  public static int findMin(int[] nums) {
    int start = 0, end = nums.length - 1;
    int min = Integer.MAX_VALUE;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (nums[start] <= nums[mid]) {
        min = Math.min(min, nums[start]);
        start = mid + 1;
      } else {
        min = Math.min(min, nums[mid]);
        end = mid - 1;
      }
    }
    return min;
  }
}
