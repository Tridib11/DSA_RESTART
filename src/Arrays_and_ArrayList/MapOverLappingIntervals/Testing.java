package Arrays_and_ArrayList.MapOverLappingIntervals;

import java.util.*;

public class Testing {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        System.out.println(Arrays.deepToString(arr));
    }
}
