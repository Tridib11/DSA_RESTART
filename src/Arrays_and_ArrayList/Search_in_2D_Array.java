package Arrays_and_ArrayList;

import java.util.*;

public class Search_in_2D_Array {
  public static void main(String[] args) {
    int[][] arr = {
        { 12, 1, 2 },
        { 2, 3, 4 },
        { 34, 55, 66, 77 },
        { 9, 89, 0 }
    };
    int target = 99;
    int[] ans = search(target, arr);
    System.out.println(Arrays.toString(ans));
  }

  private static int[] search(int target, int[][] arr) {
    for (int row = 0; row < arr.length; row++) {
      for (int col = 0; col < arr[row].length; col++) {
        if (arr[row][col] == target) {
          return new int[] { row, col };
        }
      }
    }
    return new int[] { -1, -1 };
  }
}
