package Arrays_and_ArrayList.ThreeSum;
//https://leetcode.com/problems/3sum/
import java.util.*;

public class Better {
    public static void main(String[] args) {

    }
    public List<List<Integer>> threeSum(int[] nums){
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer> tempSet=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int third=-(nums[i]+nums[j]);
                if(tempSet.contains(third)){
                    List<Integer> temp=Arrays.asList(nums[i],nums[j],third);
                    Collections.sort(temp);
                    set.add(temp);
                }
                tempSet.add(nums[j]);
            }
        }
        List<List<Integer>> ans=new ArrayList<>(set);
        return ans;
    }
}
