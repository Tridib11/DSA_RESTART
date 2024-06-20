package HashMaps.Majority_Element;
//https://leetcode.com/problems/majority-element/description/
import java.util.HashMap;
import java.util.Map;

public class Better {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int result=0;
        for(int i:nums){
            map.put(i,1+map.getOrDefault(i,0));
            if(map.get(i)>nums.length/2){
                result=i;
            }
        }
        return result;
    }

}
