package HashMaps;
/*
0 1 2  3
2 7 11 15 , target - 9
  i
9-2=7 | Check in the map for 7 if not then i will put it their {2,0}
9-7=2 \ Checks in the map for 2 if i get, it is in the map

{0,1}

Map now looks
{2,0}
 */
//https://leetcode.com/problems/two-sum/
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int remaining=target-nums[i];

            if(map.containsKey(remaining)){
                return new int[]{map.get(remaining),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
