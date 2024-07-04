package Arrays_and_ArrayList.ThreeSum;
import java.util.*;

//https://leetcode.com/problems/3sum/

public class BruteForce {
    public static void main(String[] args) {

    }
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set =new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> ans =new ArrayList<>(set);
        return ans;
    }


}
