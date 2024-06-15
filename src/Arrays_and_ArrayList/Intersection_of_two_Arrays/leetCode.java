package Arrays_and_ArrayList.Intersection_of_two_Arrays;

//https://leetcode.com/problems/intersection-of-two-arrays/
import java.util.*;
public class leetCode {
    public static void main(String[] args) {

    }
}
class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        // Declare ans array.
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0, j = 0;

        // to traverse the arrays
        while (i < nums1.length && j < nums2.length) {
            //if current element in i is smaller
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } else {
                //both elements are equal
                if (!ans.contains(nums1[i])) {
                    ans.add(nums1[i]);
                }
                i++;
                j++;
            }
        }

        // Convert ArrayList to int[]
        int[] result = new int[ans.size()];
        for (int k = 0; k < ans.size(); k++) {
            result[k] = ans.get(k);
        }
        return result;
    }
}
