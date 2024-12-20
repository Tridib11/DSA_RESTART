package Arrays_and_ArrayList;
//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class Search_in_A_Rotated_Sorted_Array_II {
  public static void main(String[] args) {

  }

  public boolean search(int[] nums, int target) {
    int start = 0, end = nums.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (nums[mid] == target)
        return true;
      if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
        start++;
        end--;
      }
      else if (nums[start] <= nums[mid]) {
        if (nums[start] <= target && target < nums[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      } else {
        if (nums[mid] < target && target <= nums[end]) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      }
    }
    return false;

  }
}
