package Arrays_and_ArrayList;
import java.util.*;
/*
https://www.naukri.com/code360/problems/subarray-sums-i_1467103
https://leetcode.com/problems/subarray-sum-equals-k/submissions/1303232010/
 */
public class SubArraySumEqualsK {
    public static void main(String[] args) {

    }
    public int subarraySum(int[] nums, int k) {
        int count=0,prefixSum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1); // adding the first value
        for(int i=0;i<=nums.length;i++){
            prefixSum+=nums[i];
            int remainingDigit=prefixSum-k;
            count+=map.getOrDefault(remainingDigit,0);
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }

}
