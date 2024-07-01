package Arrays_and_ArrayList.MajorityElements2;
//https://leetcode.com/problems/majority-element/
public class MajorityElement1 {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        int count=0;
        Integer newElement=null;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                count=1;
                newElement=nums[i];
            }else if(newElement==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        int newCounter=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==newElement){
                newCounter++;
            }
        }if(newCounter>((nums.length)/2)){
            return newElement;
        }
        else{
            return -1;
        }
    }
}
