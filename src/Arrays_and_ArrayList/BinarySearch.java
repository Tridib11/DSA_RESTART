package Arrays_and_ArrayList;

import java.util.*;

public class BinarySearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = { 1, 2, 3, 4, 5 };
    int target = 2;
    System.out.println(binary_Search(arr, target));
  }

  private static int binary_Search(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == target) {
        return mid;
      }
      if (target < arr[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }

}
