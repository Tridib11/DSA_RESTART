package Arrays_and_ArrayList.MajorityElements2;
import java.util.*;
public class Better {
    public static void main(String[] args) {

    }
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ls =new ArrayList<>();
        int mini=(int)(nums.length/3)+1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int value=map.getOrDefault(nums[i],0);
            map.put(nums[i],value+1);
            if(map.get(nums[i])==mini){
                ls.add(nums[i]);
            }
        }
        return ls;
    }
}
