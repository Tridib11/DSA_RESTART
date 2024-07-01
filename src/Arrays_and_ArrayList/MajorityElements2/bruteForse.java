package Arrays_and_ArrayList.MajorityElements2;
//https://leetcode.com/problems/majority-element-ii/description/
import java.util.*;
public class bruteForse {
    public static void main(String args[]) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = majorityElement(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(ls.size()==0 || ls.get(0)!=nums[i]){
                int count=0;
                for(int j=0;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        count++;
                    }
                }
                if(count>nums.length/3){
                    ls.add(nums[i]);
                }

                if(ls.size()==2){
                    break;
                }
            }
        }
        return ls;
    }
}
