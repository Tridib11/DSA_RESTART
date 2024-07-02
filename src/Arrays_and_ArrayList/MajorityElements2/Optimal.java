package Arrays_and_ArrayList.MajorityElements2;
import java.util.*;

//https://leetcode.com/problems/majority-element-ii/
public class Optimal {
    public static void main(String[] args) {

    }

    public List<Integer> majorityElement(int[] nums) {
        int count1=0,count2=0;
        int ele1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(count1==0 && nums[i]!=ele2){
                count1=1;
                ele1=nums[i];
            } else if (count2==0 && nums[i]!=ele1) {
                count2=1;
                ele2=nums[i];
            }else if(nums[i]==ele1){
                count1++;
            }else if(nums[i]==ele2){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }

        List<Integer> ls= new ArrayList<>();
        int newCount1=0,newCount2=0;
        for(int i=0;i<nums.length;i++){
            if(ele1==nums[i]) newCount1++;
            if(ele2==nums[i]) newCount2++;
        }

        int mini=(int)((nums.length)/3);
        if(newCount1>mini){
            ls.add(ele1);
        }
        if(newCount2>mini){
            ls.add(ele2);
        }
        return ls;
    }

}
