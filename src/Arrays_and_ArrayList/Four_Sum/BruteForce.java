package Arrays_and_ArrayList.Four_Sum;
//https://leetcode.com/problems/4sum/
import java.util.*;
public class BruteForce {
    public static void main(String[] args) {
       int[] nums={1,0,-1,0,-2,2};
       int target=0;
       List<List<Integer>> bruteforceResult=fourSum(nums,target);
        System.out.println(bruteforceResult);
    }
    public static  List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set=new HashSet<>();
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    for(int l=k+1;l<nums.length;l++){
                        long sum=(long) nums[i]+nums[j];
                        sum+=nums[k];
                        sum+=nums[l];
                        if(sum==target){
                            List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                            Collections.sort(temp);
                            set.add(temp);
                        }
                    }
                }
            }
        }
        List<List<Integer>> ans=new ArrayList<>(set);
        return ans;
    }
}
