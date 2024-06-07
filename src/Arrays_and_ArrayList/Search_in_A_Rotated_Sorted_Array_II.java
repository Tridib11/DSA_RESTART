package Arrays_and_ArrayList;

public class Search_in_A_Rotated_Sorted_Array_II {
  public static void main(String[] args) {

  }

  public boolean search(int[] nums, int target) {
    int start = 0, end = nums.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (nums[mid] == target)
        return true;
      if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
        start++;
        end--;
      }

    }
  }

}
