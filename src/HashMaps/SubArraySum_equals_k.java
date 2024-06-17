package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum_equals_k {
    public static void main(String[] args) {

    }
    public static int subarraySum(int[] nums, int k) {
        int result=0;
        int current=0;
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int i:nums){
            current+=i; //getting the prefix sum
            result+=map.getOrDefault(current-k,0);
            map.put(current,map.getOrDefault(current-k,0)+1);
        }
        return result;
    }
}
