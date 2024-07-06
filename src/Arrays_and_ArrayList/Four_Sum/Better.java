package Arrays_and_ArrayList.Four_Sum;
import java.util.*;
public class Better {
    public static void main(String[] args) {
//https://leetcode.com/problems/4sum/
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> st = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                Set<Long> hashSet=new HashSet<>();
                for(int k=j+1;k<nums.length;k++){
                    long sum=nums[i]+nums[j];
                    sum+=nums[k];
                    long minusedValue=target-sum;
                    if(hashSet.contains(minusedValue)){
                        List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k],(int)minusedValue);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                    hashSet.add((long)nums[k]);
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
}
