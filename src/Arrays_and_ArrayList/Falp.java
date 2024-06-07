package Arrays_and_ArrayList;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class Falp {
  public static void main(String[] args) {
    searchRange(null, 0);
  }

  private static int[] searchRange(int[] nums, int target) {
    int[] ans = { -1, -1 };

    int start = 0;
    int end = nums.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (nums[mid] == target) {
        ans[0] = mid;
        end = mid - 1;
      }
      if (target > nums[mid]) {
        start = mid + 1;
      } else if (target < nums[mid]) {
        end = mid - 1;
      }
    }

    start = 0;
    end = nums.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (nums[mid] == target) {
        ans[1] = mid;
        start = mid + 1;
      }

      if (target > nums[mid]) {
        start = mid + 1;
      } else if (target < nums[mid]) {
        end = mid - 1;
      }
    }

    return ans;

  }
}
