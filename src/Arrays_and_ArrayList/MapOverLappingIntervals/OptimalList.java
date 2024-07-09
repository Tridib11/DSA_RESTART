package Arrays_and_ArrayList.MapOverLappingIntervals;
import java.util.*;
public class OptimalList {
    public static void main(String[] args) {

    }
    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        // Sort the intervals based on the start time
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> ans = new ArrayList<>();

        for (int[] interval : arr) {
            // If the list is empty or the current interval does not overlap with the last interval
            if (ans.isEmpty() || interval[0] > ans.get(ans.size() - 1).get(1)) {
                List<Integer> newInterval = new ArrayList<>();
                newInterval.add(interval[0]);
                newInterval.add(interval[1]);
                ans.add(newInterval);
            } else {
                // Update the end time of the last interval if the current interval overlaps
                ans.get(ans.size() - 1).set(1, Math.max(ans.get(ans.size() - 1).get(1), interval[1]));
            }
        }

        return ans;
    }
}
